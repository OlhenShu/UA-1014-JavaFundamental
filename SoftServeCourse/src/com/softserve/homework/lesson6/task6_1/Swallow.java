package homework.lesson6.task6_1;

public class Swallow extends FlyingBird{
    public Swallow(){
        super(true,true);
    }
    @Override
    public void fly(){
        System.out.println("Swallow can fly");
    }
    @Override
    public String toString(){
        return "Swallow" + super.toString();
    }
}
