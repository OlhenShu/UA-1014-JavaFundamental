package com.softserve.edu07.practicalTask.animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Dog(),
                new Cat(),
        };

        for (Animal animal: animals) {
            System.out.printf("Animal: %s, Voice: %s, Feed: %s %n",
                    animal.getClass().getSimpleName(), animal.voice(), animal.feed());
        }
    }
}
