package homework.lesson6.task6_1;

public class Kiwi extends NonFlyingBird{
    public Kiwi(){
        super(false,true);
    }
    @Override
    public void fly(){
        System.out.println("Kiwi can't fly, but he runs well");
    }
    @Override
    public String toString(){
        return "Kiwi" + super.toString();
    }
}
