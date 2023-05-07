package com.softserve.edu06.practicalTask.computer;

public class DesktopComputer extends Computer {
    String brand;

    public DesktopComputer(String brand) {
        setBrand(brand);
    }

    public void turnOn() {
        System.out.println("Turning on desktop computer...");
    }
}
