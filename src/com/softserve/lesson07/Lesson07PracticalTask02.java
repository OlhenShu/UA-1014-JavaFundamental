package com.softserve.lesson07;

import java.util.Random;

public class Lesson07PracticalTask02 {
    public static void main(String[] args) {
        int countPerson = 10;
        Person[] persons = new Person[countPerson];
        Random random = new Random();
        for (int i = 0; i < countPerson; i++) {
            int tmp = random.nextInt(3) + 1;
            persons[i] = switch (tmp) {
                case 1 -> new Student();
                case 2 -> new Teacher();
                case 3 -> new Cleaner();
                default -> throw new IllegalStateException("Unexpected value: " + tmp);
            };
        }

        for (int i = 0; i < countPerson; i++) {
            persons[i].print();
            if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).salary();
            }
            if (persons[i] instanceof Cleaner) {
                ((Cleaner) persons[i]).salary();
            }
        }
    }
}

abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print();
}

abstract class Staff extends Person {

    public abstract void salary();
}

class Student extends Person {
    public final String TYPE_PERSON;

    Student() {
        TYPE_PERSON = this.getClass().getSimpleName();
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}

class Teacher extends Staff {
    public final String TYPE_PERSON;

    Teacher() {
        TYPE_PERSON = this.getClass().getSimpleName();
    }

    @Override
    public void print() {
        System.out.print("I am a " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        Random random = new Random();
        double tmp = random.nextDouble() * 10000 + 5000.0;
        System.out.printf(", my salary %.2f\n",tmp);
    }
}

class Cleaner extends Staff {
    public final String TYPE_PERSON;

    Cleaner() {
        TYPE_PERSON = this.getClass().getSimpleName();
    }

    @Override
    public void print() {
        System.out.print("I am a " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        Random random = new Random();
        double tmp = random.nextDouble() * 10000 + 5000.0;
        System.out.printf(", my salary %.2f\n",tmp);
    }
}
