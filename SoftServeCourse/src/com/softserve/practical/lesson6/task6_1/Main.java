package practical.lesson6.task6_1;

class Computer {
    private String brand;
    public Computer(String brand){
        this.brand = brand;
    }

    public  void turnOn(){
        System.out.println("Turning on computer...");
    }

    public void shutDown() {
        System.out.println("Shutting down computer...");
    }

    public void printBrand() {
        System.out.println("Computer brand: " + brand);
    }
    public String getBrand(){
        return brand;
    }
}

class DesktopComputer extends Computer {
    public DesktopComputer(String brand){
        super(brand);
    }
    @Override
    public void turnOn() {
        System.out.println("Turning on desktop computer...");
    }
    @Override
    public void printBrand() {
        System.out.println("Desktop computer brand: " + getBrand());
    }
    @Override
    public void shutDown() {
        System.out.println("Shutting down desktop computer...");
    }
}

class LaptopComputer extends Computer {
    public LaptopComputer(String brand) {
        super(brand);
    }
    @Override
    public void turnOn() {
        System.out.println("Turning on laptop computer...");
    }
    @Override
    public void printBrand() {
        System.out.println("Laptop computer brand: " + getBrand());
    }
    @Override
    public void shutDown() {
        System.out.println("Shutting down laptop computer...");
    }
}

public class Main {
    public static void main(String[] args) {
        Computer desktop = new DesktopComputer("ASUS");
        Computer laptop = new LaptopComputer("Fujitsu");
        Computer computer = new Computer("Acer");
        desktop.turnOn();
        laptop.turnOn();
        desktop.shutDown();
        desktop.printBrand();
        laptop.printBrand();
        computer.printBrand();
    }
}
