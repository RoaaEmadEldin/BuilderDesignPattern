package BuilderAndAbstractFactory.Factories.ComponentFactories;

import BuilderAndAbstractFactory.Components.CPU;
import BuilderAndAbstractFactory.Components.Component;
import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

public class CPUFactory implements ComponentFactory{

    @Override
    public Component createComponent(Manufacturer manufacturer) {
        return new CPU(manufacturer);
    }
}

