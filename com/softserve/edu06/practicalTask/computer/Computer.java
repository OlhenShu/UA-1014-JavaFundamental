package com.softserve.edu06.practicalTask.computer;

public abstract class Computer {
    private String brand;

    public abstract void turnOn();

    public static void shutDown() {
        System.out.println("Shutting down computer...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void feed() {
        System.out.println("Feeding the computer with electricity...");
    }

    public void printBrand() {
        System.out.printf("Computer brand: %s", getBrand());
    }
}
