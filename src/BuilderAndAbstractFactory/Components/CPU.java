package BuilderAndAbstractFactory.Components;

import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

public class CPU extends Component{

    public CPU(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public String toString() {
        return getManufacturer() + " CPU";
    }

}

