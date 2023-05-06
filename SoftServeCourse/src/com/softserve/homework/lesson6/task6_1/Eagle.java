package homework.lesson6.task6_1;

public class Eagle extends FlyingBird{
    public Eagle(){
        super(true,true);
    }
    @Override
    public void fly(){
        System.out.println("Eagle can fly");
    }
    @Override
    public String toString(){
        return "Eagle " + super.toString();
    }
}
