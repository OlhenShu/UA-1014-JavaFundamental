package homework6;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public  void fly() {
        System.out.println("This bird can fly!");
    }
}
 class Eagle extends FlyingBird{

     public Eagle(String feathers, boolean layEggs) {
         super(feathers, layEggs);
     }

 }
 class Swallow extends FlyingBird{
     public Swallow(String feathers, boolean layEggs) {
         super(feathers, layEggs);
     }

 }
