package homework.homework07.task2;

abstract public class Passengers {
    private int passenger;

    public int getPassenger() {
        return passenger;
    }
    public void setPassenger(int passenger){
        this.passenger = passenger;
    }
}
interface Vehicle{

}
abstract class WaterVehicle extends Passengers implements Vehicle{
    abstract public void isSailing();
}
abstract class FlyingVehicle extends Passengers implements Vehicle{
    public abstract void fly();
    public abstract void land();
}

abstract class GroundVehicle extends Passengers implements Vehicle{
    public abstract void drive();
}
class Liner extends WaterVehicle{
    private int floors;
    @Override
    public void isSailing() {

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
    @Override
    public void isSailing() {

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
class Plane extends FlyingVehicle {
    private int maxDistance;
    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
class Helicopter extends FlyingVehicle{
    int weight;
    int maxHeight;

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }
}
class Bus extends GroundVehicle{
    private String route;
    @Override
    public void drive() {

    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
class Motorcycle extends GroundVehicle{
    private int maxSpeed;
    @Override
    public void drive() {

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
    @Override
    public void drive() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}