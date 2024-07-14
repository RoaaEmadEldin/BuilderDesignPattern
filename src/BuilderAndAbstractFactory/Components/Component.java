package BuilderAndAbstractFactory.Components;

import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

abstract public class Component {
    protected Manufacturer manufacturer;

    public Component(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    public abstract String toString();

}
