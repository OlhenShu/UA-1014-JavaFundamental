package homeworkFirstTask;

public class Kiwi extends NonFlyingBird{
    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly() {
        System.out.println("Kiwi is a non-flying bird.");
    }
}
