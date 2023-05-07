package com.softserve.edu07.practicalTask.person;

public abstract class Staff extends Person {
    public Staff(String name, String TYPE_PERSON) {
        super(name, TYPE_PERSON);
    }

    abstract double salary();
}
