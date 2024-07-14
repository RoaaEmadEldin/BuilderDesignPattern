package BuilderAndAbstractFactory.Factories.ComponentFactories;

import BuilderAndAbstractFactory.Components.Component;
import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

public interface ComponentFactory {
    Component createComponent(Manufacturer manufacturer);
}
