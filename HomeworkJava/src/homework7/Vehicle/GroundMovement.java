package homework7.Vehicle;

public class GroundMovement extends Passengers implements Vehicle {
    public GroundMovement(int passengers) {
        super(passengers);
    }
    @Override
    public void drive() {}

    @Override
    public void move() {
        System.out.println("Ground movement");
    }
}
class Bus extends GroundMovement implements Vehicle{
    final String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("The bus rides through the darkness to hell");
    }

    public String toString() {
        return String.format("passengers: %d route: %s", getPassengers(), route);
    }
}
class Motorcycle extends GroundMovement{
    final int MaxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        MaxSpeed = maxSpeed;
    }
    public String toString() {
        return String.format("passengers: %d MaxSpeed: %d", getPassengers(), MaxSpeed);

    }
    @Override
    public void drive() {
        System.out.println("Maximum speed 300 kmh");
    }
}
