package java8;

public class cores {

    public static void main(String[] args) {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("CPU cores: " + processors); // prints 12 but 6 cores it has //1 CPU x 6 cores x 2 threads = 12 total cores.
    }
}
