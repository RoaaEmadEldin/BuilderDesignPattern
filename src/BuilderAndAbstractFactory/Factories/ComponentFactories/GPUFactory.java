package BuilderAndAbstractFactory.Factories.ComponentFactories;

import BuilderAndAbstractFactory.Components.Component;
import BuilderAndAbstractFactory.Components.GPU;
import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

public class GPUFactory implements ComponentFactory{

    @Override
    public Component createComponent(Manufacturer manufacturer) {
        return new GPU(manufacturer);
    }
}
