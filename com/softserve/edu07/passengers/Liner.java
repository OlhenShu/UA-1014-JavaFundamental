package com.softserve.edu07.passengers;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner() {
    }

    @Override
    protected void isSailing() {
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
