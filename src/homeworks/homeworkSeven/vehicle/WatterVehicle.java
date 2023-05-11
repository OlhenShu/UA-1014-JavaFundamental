package homeworkSeven.vehicle;

public abstract class WatterVehicle extends Passengers implements Vehicle {

    public WatterVehicle(int passengers) {
        super(passengers);
    }

    public abstract void isSailing();
}
