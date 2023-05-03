package com.softserve.edu06.bird;

public class NoFlyingBird extends Bird {
    public NoFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }
}

class Penguin extends NoFlyingBird {
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "I'm penguin";
    }
}

class Chicken extends NoFlyingBird {
    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "I'm Chicken";
    }
}
