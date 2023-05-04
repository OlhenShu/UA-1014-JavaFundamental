package homework6;

public class NonFlyingBird extends Bird  {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }


    @Override
    public void fly() {
        System.out.println("This bird can't fly!");

    }
}
class Penguin extends NonFlyingBird{
    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}
class Kiwi extends NonFlyingBird{
    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

}
