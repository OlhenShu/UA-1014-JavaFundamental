package com.softserve.lesson07;

import java.util.Random;

public class Lesson07PracticalTask01 {
    public static void main(String[] args) {
        int countAnimal = 10;
        Animal[] animal = new Animal[countAnimal];
        Random random = new Random();
        for (int i = 0; i < countAnimal; i++) {
            int tmp = random.nextInt(2) + 1;
            animal[i] = switch (tmp) {
                case 1 -> new Cat();
                case 2 -> new Dog();
                default -> throw new IllegalStateException("Unexpected value: " + tmp);
            };
        }
        for (int i = 0; i < countAnimal; i++) {
            animal[i].voice();
            animal[i].feed();
            System.out.println("");
        }
    }
}

interface Animal {
    void voice();

    void feed();
}

class Cat implements Animal {
    @Override
    public void voice() {
        System.out.print("Meow meow ");
    }

    @Override
    public void feed() {
        System.out.print("Eat fish ");
    }
}

class Dog implements Animal {
    @Override
    public void voice() {
        System.out.print("Woof woof ");
    }

    @Override
    public void feed() {
        System.out.print("Eat a bone ");
    }
}