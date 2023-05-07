package com.softserve.edu07.passengers;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }

    protected abstract void fly();

    protected abstract void land();
}
