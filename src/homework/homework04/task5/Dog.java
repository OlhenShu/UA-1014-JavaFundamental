package homework.homework04.task5;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;
    private Breed breed;

    Dog(String name, int age, Breed breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }
    public static void main(String[] args){
        Dog dog1 = new Dog("Lucky", 12, Breed.CORGI);
        Dog dog2 = new Dog("Rolly", 5, Breed.RETRIEVER);
        Dog dog3 = new Dog("Pepper", 8, Breed.POODLE);

        if(!dog1.equals(dog2) && !dog2.equals(dog3) && !dog1.equals(dog3)){
            Dog oldDog = maxAge(maxAge(dog1, dog2), dog3);
            System.out.println("Name of oldest dog: " + oldDog.getName() +
                    ". Her breed: " + oldDog.getBreed().getFullBreed());
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name); //&& age = dog.age && breed == dog.breed;
    }


    public static Dog maxAge(Dog a, Dog b) {
        if (a.getAge() > b.getAge()){  return a;}
        else { return b;}
    }
}

enum Breed {
    BULLDOG("French Bulldog"), RETRIEVER("Golden Retriever"), POODLE("Poodle"),
    BEAGLE("Beagle"), ROTTWEILER("Rottweiler"), CORGI("Pembroke Welsh Corgi");
    private final String fullBreed;

    Breed(String fullBreed) {
        this.fullBreed= fullBreed;;
    }

    public String getFullBreed() {
        return fullBreed;
    }
}