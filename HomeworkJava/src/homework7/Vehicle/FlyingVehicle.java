package homework7.Vehicle;

public class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle(int passengers) {
        super(passengers);
    }
    @Override
    public void drive() {}

    @Override
    public void move() {
        System.out.println("Air movement");
    }
}
class  Plane extends FlyingVehicle {
    final int maxDistance;
    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }
    public String toString() {
        return String.format("passengers: %d maxDistance: %d", getPassengers(), maxDistance);
    }

}
class Helicopter extends FlyingVehicle{
    final int weight;
    final int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }
    public String toString() {
        return String.format("passengers: %d weight: %d maxHeight: %d", getPassengers(), weight, maxHeight);
    }
}
