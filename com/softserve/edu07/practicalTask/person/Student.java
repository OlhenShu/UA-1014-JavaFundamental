package com.softserve.edu07.practicalTask.person;

public class Student extends Person {
    final static String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name, TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.printf("I'm a student, my name is %s, i don't have salary", getName());
    }
}
