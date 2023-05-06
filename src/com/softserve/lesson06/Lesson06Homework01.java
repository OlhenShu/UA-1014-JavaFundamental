package com.softserve.lesson06;

import java.util.Random;

public class Lesson06Homework01 {
    public static void main(String[] args) {
        int countBird = 10;
        Bird[] birds = new Bird[countBird];
        Random random = new Random();
        for (int i = 0; i < countBird; i++) {
            int tmp = random.nextInt(4) + 1;
            birds[i] = switch (tmp) {
                case 1 -> new Eagle();
                case 2 -> new Swallow();
                case 3 -> new Penguin();
                case 4 -> new Kiwi();
                default -> throw new IllegalStateException("Unexpected value: " + tmp);
            };
        }
        for (int i = 0; i < countBird; i++) {
            birds[i].fly();
        }
    }
}

abstract class Bird {
    private String feathers;
    private String layEggs;

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }
    public String getFeathers() {
        return feathers;
    }
    public String getLayEggs() {
        return layEggs;
    }
    public abstract void fly();
}

class FlyingBird extends Bird {
    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}

class NonFlyingBird extends Bird {
    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}

class Eagle extends FlyingBird {
    @Override
    public void fly() {
        System.out.print("Eagle ");
        super.fly();
    }
}

class Swallow extends FlyingBird {
    @Override
    public void fly() {
        System.out.print("Swallow ");
        super.fly();
    }
}

class Penguin extends NonFlyingBird {
    @Override
    public void fly() {
        System.out.print("Penguin ");
        super.fly();
    }
}

class Kiwi extends NonFlyingBird {
    @Override
    public void fly() {
        System.out.print("Kiwi ");
        super.fly();
    }
}