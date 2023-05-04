package com.lesson3;

public class Person_main_hw3 {
    public static void main(String[] args) {
        Person pers1 = new Person("Ann", "Bradley", 2003);
        pers1.output();
        Person pers2 = new Person("John", "Doe", 1985);
        pers2.output();

        Person pers3 = new Person();
        pers3.setFirstname("Alice");
        pers3.setLastname("Smith");
        pers3.setBirthYear(1992);
        pers3.output();

        Person pers4 = new Person("David", "Lee", 1999);
        System.out.println("Before:");
        pers4.output();
        pers4.setBirthYear(2001);
        System.out.println("After:");
        pers4.output();

        Person pers5 = new Person();

        pers5.input();
        pers5.output();

        Person pers6 = new Person("Emily", "Wang", 2005);
        System.out.println("Before:");
        pers6.output();
        pers6.changeName();
        System.out.println("After:");
        pers6.output();



    }
}
