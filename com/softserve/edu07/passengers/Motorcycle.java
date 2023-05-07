package com.softserve.edu07.passengers;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle() {
    }

    @Override
    protected void drive() {

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
