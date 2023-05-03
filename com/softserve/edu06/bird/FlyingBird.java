package com.softserve.edu06.bird;

public class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {

    }

}

class Eagle extends FlyingBird {
    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am an eagle and I fly high");
    }

    @Override
    public String toString() {
        return "I'm Eagle";
    }
}

class Swallow extends FlyingBird {
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am a swallow and I fly fast");
    }

    @Override
    public String toString() {
        return "I'm Swallow";
    }
}
