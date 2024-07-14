package BuilderAndAbstractFactory.Components;

import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

public class RAM extends Component {

    public RAM(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public String toString() {
        return getManufacturer() + " RAM";
    }
}
