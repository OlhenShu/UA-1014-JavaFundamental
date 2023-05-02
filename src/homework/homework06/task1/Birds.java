package homework.homework06.task1;
abstract class Birds {
    boolean feathers;
    boolean layEggs;
    abstract public void fly();
}

class FlyingBird extends Birds{
    private String type;
    FlyingBird(boolean feathers, boolean layEggs){
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    @Override
    public void fly() {
        System.out.println("I can fly...");
    }
    public String getType() {
        return type;
    }
}
class NonFlyingBird extends Birds {
    private String type;
    NonFlyingBird(boolean feathers, boolean layEggs){
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
    public String getType() {
        return type;
    }
}
class Eagle extends FlyingBird {
    private String type = "Eagle";
    Eagle(boolean feathers, boolean layEggs){
        super(feathers,layEggs);
    }
    public void fly(){
        System.out.println("I fly high.");
    }

    @Override
    public String getType() {
        return type;
    }
}
class Swallow extends FlyingBird {
    final String type = "Swallow";
    Swallow(boolean feathers, boolean layEggs){
        super(feathers,layEggs);
    }
    public void fly(){
        System.out.println("I fly low.");
    }
    @Override
    public String getType() {
        return type;
    }
}

class Penguin extends NonFlyingBird {
    final String type = "Penguin";
    Penguin(boolean feathers, boolean layEggs){
        super(feathers,layEggs);
    }
    public void fly(){
        super.fly();
    }
    @Override
    public String getType() {
        return type;
    }
}

class Kiwi extends NonFlyingBird {
    final String type = "Kiwi";
    Kiwi(boolean feathers, boolean layEggs){
        super(feathers,layEggs);
    }
    public void fly(){
        super.fly();
    }
    @Override
    public String getType() {
        return type;
    }
}

class BirdsTest{
    public static void main(String[] args){
        Kiwi kiwi = new Kiwi(true, true);
        Penguin penguin = new Penguin(true, true);
        Swallow swallow = new Swallow(true, true);
        Eagle eagle = new Eagle(true,true);

        Birds[] birds= {kiwi, penguin, swallow, eagle};
        for(Birds bird : birds ){
            if (bird instanceof FlyingBird bird1){
                System.out.print("My type is " + bird1.getType() + ". ");
            }
            if (bird instanceof NonFlyingBird bird2){
                System.out.print("My type is " + bird2.getType() + ". ");
            }
            bird.fly();
        }
    }
}