package BuilderAndAbstractFactory;

import BuilderAndAbstractFactory.Components.Component;

public class PC {
    private final Component cpu;
    private final Component gpu;
    private final Component ram;
    private final Component storage;
    private final Component powerSupply;

    private PC(PCBuilder builder) {
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.powerSupply = builder.powerSupply;
    }

    @Override
    public String toString() {
        return "Your Custom PC: " +
                "{ " + cpu +
                ", " + gpu +
                ", " + ram +
                ", " + storage +
                ", " + powerSupply +
                " }";
    }

    public static class PCBuilder {
        private Component cpu;
        private Component gpu;
        private Component ram;
        private Component storage;
        private Component powerSupply;

        public PCBuilder setCPU(Component cpu) {
            this.cpu = cpu;
            return this;
        }

        public PCBuilder setGPU(Component gpu) {
            this.gpu = gpu;
            return this;
        }
        public PCBuilder setRAM(Component ram) {
            this.ram = ram;
            return this;
        }
        public PCBuilder setStorage(Component storage) {
            this.storage = storage;
            return this;
        }
        public PCBuilder setPowerSupply(Component powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }
        public PC buildPC(){
            return new PC(this);
        }
    }
}
