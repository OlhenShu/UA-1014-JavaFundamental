package com.softserve.edu06.practicalTask.car;

public class Sedan extends Car {
    public Sedan(String model, double maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan is run");
    }

    @Override
    public void stop() {
        System.out.println("Sedan is stop");
    }
}
