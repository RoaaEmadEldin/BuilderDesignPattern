package BuilderAndAbstractFactory.Components;

import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

public class PowerSupply extends Component {

    public PowerSupply(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public String toString() {
        return getManufacturer() + " Power Supply";
    }
}
