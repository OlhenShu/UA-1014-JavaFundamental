package com.softserve.edu07.practicalTask.person;

public class Cleaner extends Staff {
    final static String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name, TYPE_PERSON);
    }

    @Override
    double salary() {
        return 8500;
    }

    @Override
    void print() {
        System.out.printf("I'm a %s, my name is: %s%n", getName(), TYPE_PERSON);
    }
}
