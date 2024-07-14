package BuilderAndAbstractFactory.Factories.ManufacturerFactories;

import BuilderAndAbstractFactory.Manufacturers.AMDManufacturer;
import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

public class AMDFactory implements ManufacturerFactory{

    @Override
    public Manufacturer createManufacturer() {
        return new AMDManufacturer();
    }
}
