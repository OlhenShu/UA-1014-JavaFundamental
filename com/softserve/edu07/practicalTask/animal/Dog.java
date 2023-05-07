package com.softserve.edu07.practicalTask.animal;

public class Dog implements Animal {
    @Override
    public String voice() {
        return "Woof woof!";
    }

    @Override
    public String feed() {
        return "I'm eat meat.";
    }
}
