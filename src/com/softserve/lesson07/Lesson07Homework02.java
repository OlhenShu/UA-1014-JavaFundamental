package com.softserve.lesson07;

public class Lesson07Homework02 {
    public static void main(String[] args) {

    }
}

class Passengers {
    private int passengers;

    public Passengers() {
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}

interface Vehicle {
}

abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle() {
    }

    protected abstract void isSailing();
}

abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }

    protected abstract void fly();
    protected abstract void land();
}

abstract class GroundVehicle extends Passengers implements Vehicle{
    public GroundVehicle() {
    }
    protected abstract void drive();
}

class Liner extends WaterVehicle{
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

class Boat extends WaterVehicle{
    private int volume;

    public Boat() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    protected void isSailing() {
    }
}

class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane() {
    }

    @Override
    protected void fly() {
    }

    @Override
    protected void land() {
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter() {
    }

    @Override
    protected void fly() {
    }

    @Override
    protected void land() {
    }
}

class Bus extends GroundVehicle{
    private String route;

    public Bus() {
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    protected void drive() {
    }
}

class Motorcycle extends GroundVehicle{
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

class Car extends GroundVehicle{
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