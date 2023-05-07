package com.softserve.edu07.practicalTask.animal;

public class Cat implements Animal {
    @Override
    public String voice() {
        return "Meaw meaw!";
    }

    @Override
    public String feed() {
        return "I'm eat kitty cat.";
    }
}
