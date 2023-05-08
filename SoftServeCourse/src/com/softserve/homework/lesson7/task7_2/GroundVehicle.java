package homework.lesson7.task7_2;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    protected GroundVehicle(int passengers){
        super(passengers);
    }
    protected abstract void drive();
}
