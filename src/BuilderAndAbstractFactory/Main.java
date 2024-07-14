package BuilderAndAbstractFactory;

import BuilderAndAbstractFactory.Components.Component;
import BuilderAndAbstractFactory.Factories.ComponentFactories.*;
import BuilderAndAbstractFactory.Factories.ManufacturerFactories.AMDFactory;
import BuilderAndAbstractFactory.Factories.ManufacturerFactories.IntelFactory;
import BuilderAndAbstractFactory.Factories.ManufacturerFactories.NVIDIAFactory;
import BuilderAndAbstractFactory.Factories.ManufacturerFactories.SamsungFactory;
import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

public class Main {
    public static void main(String[] args) {
        Manufacturer intel = new IntelFactory().createManufacturer();
        Manufacturer amd = new AMDFactory().createManufacturer();
        Manufacturer nvidia = new NVIDIAFactory().createManufacturer();
        Manufacturer samsung = new SamsungFactory().createManufacturer();

        Component cpu = new CPUFactory().createComponent(intel);
        Component gpu = new GPUFactory().createComponent(nvidia);
        Component ram = new RAMFactory().createComponent(amd);
        Component storage = new StorageFactory().createComponent(amd);
        Component power = new PowerSupplyFactory().createComponent(samsung);
        PC.PCBuilder builder = new PC.PCBuilder()
                .setCPU(cpu)
                .setGPU(gpu)
                .setRAM(ram)
                .setStorage(storage)
                .setPowerSupply(power);

        PC gamingPC = builder.buildPC();
        System.out.print(gamingPC);
    }
}