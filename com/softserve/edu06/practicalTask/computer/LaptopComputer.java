package com.softserve.edu06.practicalTask.computer;

public class LaptopComputer extends Computer {
    String brand;

    public LaptopComputer(String brand) {
        setBrand(brand);
    }

    public void turnOn() {
        System.out.println("Turning on laptop computer...");
    }
}
