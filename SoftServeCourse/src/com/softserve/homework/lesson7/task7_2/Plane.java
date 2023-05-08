package homework.lesson7.task7_2;

public class Plane extends FlyingVehicle{
    private int maxDistance;
    public Plane(int passengers,int maxDistance){
        super(passengers);
        this.maxDistance = maxDistance;
    }
    @Override
    public void fly(){
        System.out.println("The plane rises into the sky and flies");
    }
    @Override
    public void land(){
        System.out.println("the plane lands");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
