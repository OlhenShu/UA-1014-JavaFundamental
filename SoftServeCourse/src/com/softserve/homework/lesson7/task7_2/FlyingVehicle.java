package homework.lesson7.task7_2;

public abstract class FlyingVehicle extends  Passengers implements Vehicle{
    protected FlyingVehicle(int passengers){
        super(passengers);
    }
    protected abstract void fly();
    protected abstract void land();
}
