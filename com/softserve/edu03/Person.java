package com.softserve.edu03;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear; //the birthday year

    public static void main(String[] args) {
        int countPersons = 5;

        Person[] people = new Person[countPersons];

        for (int i = 0; i < countPersons; i++) {
            System.out.printf("Enter information about person %d:\n", (i + 1));

            Person person = new Person();
            person.input();
            people[i] = person;
        }

        for (Person person : people) {
            person.output();
        }
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        changeName(firstName, lastName);
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return java.time.Year.now().getValue() - getBirthYear();
    }

    private void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first name: ");
        setFirstName(scanner.nextLine());

        System.out.print("Input the last name: ");
        setLastName(scanner.nextLine());

        System.out.print("Input the birthday year: ");
        setBirthYear(scanner.nextInt());
    }

    private void output() {
        System.out.printf("Name: %s %s, Birth year: %d, Age: %d\n", getFirstName(), getLastName(), getBirthYear(), getAge());
    }

    private void changeName(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }
}
