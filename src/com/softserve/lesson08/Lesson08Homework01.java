package com.softserve.lesson08;

public class Lesson08Homework01 {
    public static void main(String[] args) {
        Person person = new Person(new FullName("John", "Smith"), 25) {
            @Override
            public String activity() {
                return null;
            }
        };
        System.out.println(person.info());
    }
}

class FullName {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

abstract class Person {
    FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "First name: <" + fullName.getFirstName() + ">, Last name: <" + fullName.getLastName() + ">, Age: <" + age + ">";
    }

    public abstract String activity();
}
