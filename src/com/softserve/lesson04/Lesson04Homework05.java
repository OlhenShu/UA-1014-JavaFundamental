package com.softserve.lesson04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Lesson04Homework05 {
    public static void main(String[] args) {
        ArrayList<Dog> arrayDog = new ArrayList<>();
        int countDog = 3;
        ArrayList<String> arrayName = new ArrayList<>();
        ArrayList<Integer> arrayAge = new ArrayList<>();

        for (int i = 0; i < countDog; i++) {
            arrayDog.add(new Dog());
            arrayDog.get(i).input();

            arrayName.add(arrayDog.get(i).getName());
            arrayAge.add(arrayDog.get(i).getAge());

        }
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < countDog; i++) {
            for (int j = i + 1; j < countDog; j++) {
                if (arrayName.get(i).equals(arrayName.get(j))) {
                    hashSet.add(arrayName.get(i));
                }
            }
        }

        System.out.println("dogs with the same name:");

        for (String str : hashSet) {
            System.out.println("name: " + str);
        }

        int maxPrise = Collections.max(arrayAge);
        int indexMaxPrise = arrayAge.indexOf(maxPrise);
        System.out.println("The oldest dog:\n" +
                "name: " + arrayDog.get(indexMaxPrise).getName() +
                " breed: " + arrayDog.get(indexMaxPrise).getBreed());
    }
}

class Dog {
    private String name;
    private Breed breed;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name Dog: ");
        name = scanner.next();
        System.out.print("Input breed Dog: ");
        String br = scanner.next();
        breed = Breed.valueOf(br);
        System.out.print("Input age Dog: ");
        age = scanner.nextInt();
    }
}

enum Breed {
    GERMANSPITZ, CHIHUAHUA, YORKSHIRETERRIER, GERMANSHEPHERD, HUSKY
}
