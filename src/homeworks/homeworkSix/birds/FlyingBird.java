package homeworkSix.birds;

public class FlyingBird extends Bird {


    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}