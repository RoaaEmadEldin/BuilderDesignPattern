package Builder;

public class Main {
    public static void main(String[] args) {
        PC gamingPC = new PC.PCBuilder()
                .setCPU("Intel i9")
                .setGPU("NVIDIA GeForce RTX 3080")
                .setRAM("32GB DDR4")
                .setStorage("Samsung 2TB SSD")
                .setPowerSupply("850W")
                .buildPC();

        System.out.println(gamingPC);
    }
}
