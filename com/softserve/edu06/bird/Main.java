package com.softserve.edu06.bird;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(true, true),
                new Swallow(true, true),
                new Penguin(false, false),
                new Chicken(true, true),
        };

        for (Bird bird : birds) {
            System.out.println(bird);
            bird.fly();
        }
    }
}
