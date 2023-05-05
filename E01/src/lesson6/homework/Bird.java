package lesson6.homework;

public abstract class Bird {
    boolean feathers;
    boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    @Override
    public abstract String toString();
}

class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Of course, I can fly");
    }

    @Override
    public String toString() {
        return "FlyingBird";
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Unfortunately, I cannot fly");
    }

    @Override
    public String toString() {
        return "NonFlyingBird{}";
    }
}

class Eagle extends FlyingBird {
    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am flying high");
    }

    @Override
    public String toString() {
        return "Eagle";
    }
}

class Swallow extends FlyingBird {
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am flying low");
    }

    @Override
    public String toString() {
        return "Swallow";
    }
}

class Penguin extends NonFlyingBird {
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public String toString() {
        return "Penguin";
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public String toString() {
        return "Kiwi";
    }
}

class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(true, true),
                new Swallow(true, true),
                new Penguin(true, true),
                new Kiwi(true, true)};
        for (var bird : birds) {
            System.out.println(bird.toString());
            bird.fly();
        }
    }
}

