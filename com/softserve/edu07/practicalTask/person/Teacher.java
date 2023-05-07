package com.softserve.edu07.practicalTask.person;

public class Teacher extends Staff {
    final static String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name, TYPE_PERSON);
    }

    @Override
    double salary() {
        return 16000;
    }

    @Override
    void print() {
        System.out.printf("I'm a %s, my name is: %s%n", getName(), TYPE_PERSON);
    }
}
