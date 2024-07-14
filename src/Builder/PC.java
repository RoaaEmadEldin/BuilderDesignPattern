package Builder;


public class PC {
    private final String cpu;
    private final String gpu;
    private final String ram;
    private final String storage;
    private final String powerSupply;

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
                "{ CPU: " + cpu +
                ", GPU: " + gpu +
                ", RAM: " + ram +
                ", Storage: " + storage +
                ", Power Supply: " + powerSupply +
                " }";
    }

    public static class PCBuilder {
        private String cpu;
        private String gpu;
        private String ram;
        private String storage;
        private String powerSupply;

        public PCBuilder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public PCBuilder setGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }
        public PCBuilder setRAM(String ram) {
            this.ram = ram;
            return this;
        }
        public PCBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public PCBuilder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }
        public PC buildPC(){
            return new PC(this);
        }
    }
}

