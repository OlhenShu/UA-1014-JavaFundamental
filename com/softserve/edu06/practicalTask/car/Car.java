package com.softserve.edu06.practicalTask.car;

/**
 * Create abstract class called Car with:
 * • fields: model, maxSpeed and yearOfProduction;
 * • methods: run() and stop().
 * Create classes called Truck and Sedan which extend class Car.
 * In main() method create array of Car’s objects. Add to this array some
 * trucks and sedans and print info about it.
 */
public abstract class Car {
    private final String model;
    private final double maxSpeed;
    private final int yearOfProduction;

    public Car(String model, double maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }
    public abstract void run();

    public abstract void stop();

    public String getModel() {
        return model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return String.format("Model: %s, \tMax speed: %.2f, \tYear of production: %d", getModel(), getMaxSpeed(), getYearOfProduction());
    }
}
