package homework.lesson7.task7_2;

public abstract class WaterVehicle extends Passengers implements Vehicle{
    protected WaterVehicle(int passengers){
        super(passengers);
    }
    protected abstract void isSailing();
}
