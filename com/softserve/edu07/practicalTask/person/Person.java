package com.softserve.edu07.practicalTask.person;

public abstract class Person {
    protected String name;
    final String TYPE_PERSON;

    public Person(String name, String TYPE_PERSON) {
        setName(name);
        this.TYPE_PERSON = TYPE_PERSON;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void print();
}
