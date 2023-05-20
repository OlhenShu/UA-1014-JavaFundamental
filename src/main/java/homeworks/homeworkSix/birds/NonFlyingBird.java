package homeworks.homeworkSix.birds;

public class NonFlyingBird extends Bird {
    
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    
    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
