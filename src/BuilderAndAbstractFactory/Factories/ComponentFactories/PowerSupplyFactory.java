package BuilderAndAbstractFactory.Factories.ComponentFactories;

import BuilderAndAbstractFactory.Components.Component;
import BuilderAndAbstractFactory.Components.PowerSupply;
import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

public class PowerSupplyFactory implements ComponentFactory{

    @Override
    public Component createComponent(Manufacturer manufacturer) {
        return new PowerSupply(manufacturer);
    }
}
