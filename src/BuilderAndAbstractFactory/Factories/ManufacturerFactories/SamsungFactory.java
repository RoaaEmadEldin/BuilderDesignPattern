package BuilderAndAbstractFactory.Factories.ManufacturerFactories;

import BuilderAndAbstractFactory.Manufacturers.Manufacturer;
import BuilderAndAbstractFactory.Manufacturers.SamsungManufacturer;

public class SamsungFactory implements ManufacturerFactory{

    @Override
    public Manufacturer createManufacturer() {
        return new SamsungManufacturer();
    }
}
