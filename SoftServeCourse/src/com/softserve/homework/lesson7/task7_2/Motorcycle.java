package homework.lesson7.task7_2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;
    public Motorcycle(int passengers,int maxSpeed){
        super(passengers);
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void drive(){
        System.out.println("the motorcycle is going");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
