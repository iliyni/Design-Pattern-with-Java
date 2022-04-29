public class Gaming extends Computer {
    @Override
    void plugCPU() {
        System.out.println("Putting high-end multi-core CPU.");
    }

    @Override
    void plugMemory() {
        System.out.println("Putting high clock speed memory.");
    }

    @Override
    void plugStorage() {
        System.out.println("Putting SSD storage.");
    }
}
