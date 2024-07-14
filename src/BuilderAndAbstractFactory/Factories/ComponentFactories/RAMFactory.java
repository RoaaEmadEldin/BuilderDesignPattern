package BuilderAndAbstractFactory.Factories.ComponentFactories;

import BuilderAndAbstractFactory.Components.Component;
import BuilderAndAbstractFactory.Components.RAM;
import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

public class RAMFactory implements ComponentFactory{

    @Override
    public Component createComponent(Manufacturer manufacturer) {
        return new RAM(manufacturer);
    }
}
