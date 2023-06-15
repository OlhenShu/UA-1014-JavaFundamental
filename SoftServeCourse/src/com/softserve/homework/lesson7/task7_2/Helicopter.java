package homework.lesson7.task7_2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;
    public Helicopter(int passengers,int weight,int maxHeight){
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }
    @Override
    public void fly(){
        System.out.println("The helicopter rises into the sky and flies");
    }
    @Override
    public void land(){
        System.out.println("The helicopter lands");
    }
}
