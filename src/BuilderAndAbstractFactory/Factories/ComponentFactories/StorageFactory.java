package BuilderAndAbstractFactory.Factories.ComponentFactories;

import BuilderAndAbstractFactory.Components.Component;
import BuilderAndAbstractFactory.Components.Storage;
import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

public class StorageFactory implements ComponentFactory{

    @Override
    public Component createComponent(Manufacturer manufacturer) {
        return new Storage(manufacturer);
    }
}
