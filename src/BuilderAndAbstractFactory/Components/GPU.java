package BuilderAndAbstractFactory.Components;

import BuilderAndAbstractFactory.Manufacturers.Manufacturer;

public class GPU extends Component{

    public GPU(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public String toString() {
        return getManufacturer() + " GPU";
    }


}

