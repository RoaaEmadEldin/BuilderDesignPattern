package BuilderAndAbstractFactory.Factories.ManufacturerFactories;

import BuilderAndAbstractFactory.Manufacturers.*;

public class IntelFactory implements ManufacturerFactory{

    @Override
    public Manufacturer createManufacturer() {
        return new IntelManufacturer();
    }
}