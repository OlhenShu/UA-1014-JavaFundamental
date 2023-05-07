package com.softserve.edu07.passengers;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle() {
    }

    protected abstract void drive();
}
