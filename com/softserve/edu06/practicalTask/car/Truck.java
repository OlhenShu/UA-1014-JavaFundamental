package com.softserve.edu06.practicalTask.car;

public class Truck extends Car {
    public Truck(String model, double maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck is run");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stop");
    }
}
