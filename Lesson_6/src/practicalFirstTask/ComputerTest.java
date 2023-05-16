package practicalFirstTask;

public class ComputerTest {
    public static void main(String[] args) {
        Computer desktop = new DesktopComputer();
        Computer laptop = new LaptopComputer();
        DesktopComputer.turnOn();
        laptop.turnOn();
        desktop.shutDown();
        DesktopComputer.printBrand();
        LaptopComputer.printBrand();
        Computer.printBrand();
    }
}

