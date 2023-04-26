package com.softserve.edu04;

import java.util.Objects;

/**
 * Create a class called Dog that has the following fields: name, breed, age.
 * •Declare enum for field breed.
 * •In main() method create three instances of type Dog.
 * o Check if there are no two dogs with the same name;
 * o Output the name and the breed of the oldest dog.
 */
public class Dog {
    enum Breed {
        BOXER,
        TERRIER,
        BULLDOG,
        MASTIFF,
    }

    private String name;
    private String breed;
    private int age;
    private static Dog oldest;
    private static final String[] dogNames = new String[3];
    private static int countDogs = 0;

    public Dog(String name, String breed, int age) {
        // here you can think of something more elegant :)
        for (var i = 0; i < countDogs; i++) {
            if (Objects.equals(dogNames[i], name)) {
                System.out.printf("A dog with the same name \"%s\" already exists.\n", name);
                return;
            }
        }

        this.name = name;
        this.breed = breed;
        this.age = age;

        dogNames[countDogs++] = name;
    }

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Chak", "terrier", 1),
                new Dog("Lord", "MASTIFF", 11),
                new Dog("Chernysh", "BOXER", 3),
        };

        int older = 0;

        for (Dog dog : dogs) {
            int age = dog.getAge();

            if (age > older) {
                older = age;
                setOldest(dog);
            }
        }

        System.out.printf("Older dog is %s, he breed is %s\n", getOldest().getName(), getOldest().getBreed());
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public static Dog getOldest() {
        return oldest;
    }

    public static void setOldest(Dog oldest) {
        Dog.oldest = oldest;
    }
}
