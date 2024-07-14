package BuilderAndAbstractFactory.Factories.ManufacturerFactories;

import BuilderAndAbstractFactory.Manufacturers.Manufacturer;
import BuilderAndAbstractFactory.Manufacturers.NVIDIAManufacturer;

public class NVIDIAFactory implements ManufacturerFactory{

    @Override
    public Manufacturer createManufacturer() {
        return new NVIDIAManufacturer();
    }
}
