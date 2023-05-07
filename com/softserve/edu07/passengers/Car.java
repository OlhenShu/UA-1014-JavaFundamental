package com.softserve.edu07.passengers;

public class Car extends GroundVehicle {
    private String model;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    protected void drive() {

    }
}
