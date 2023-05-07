package com.softserve.edu06.practicalTask.computer;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = {
                new DesktopComputer("Asus"),
                new LaptopComputer("HP"),
                new LaptopComputer("Lenovo"),
                new DesktopComputer("Acer"),
        };

        for (Computer computer : computers) {
            computer.turnOn();
            Computer.shutDown();
            computer.printBrand();
        }
    }
}