package BuilderAndAbstractFactory.Components;

import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

public class Storage extends Component {

    public Storage(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public String toString() {
        return getManufacturer() + " Storage";
    }
}
