package homework.lesson6.task6_1;

public class Penguin extends NonFlyingBird{
    public Penguin(){
        super(false,true);
    }
    @Override
    public void fly(){
        System.out.println("Penguin can't fly, but he swims well");
    }
    @Override
    public String toString(){
        return "Penguin " + super.toString();
    }
}
