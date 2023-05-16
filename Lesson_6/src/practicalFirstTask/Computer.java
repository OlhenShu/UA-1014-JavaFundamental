package practicalFirstTask;

 abstract class Computer {
    static String brand ="Generic";


     public static void turnOn() {
     }

     public void shutDown() {
        System.out.println("Shutting down computer...");
    }

    static void printBrand() {
        System.out.println("Computer brand: " + brand);
    }
}
