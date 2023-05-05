package com.softserve.lesson03;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lesson03Homework03 {
    public static void main(String[] args) {
        int countPerson = 5;
        Person[] person = new Person[countPerson];
        for (int i = 0; i < countPerson; i++) {
            person[i] = new Person();
            person[i].input();
            person[i].getAge();
            person[i].output();
        }
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public static int count = 0;
    public int countPer = 0;

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

    public Person() {
        count++;
        countPer = count;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        count++;
        countPer = count;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input firstName Person" + countPer + ": ");
        firstName = scanner.nextLine();
        System.out.print("Input lastName Person" + countPer + ": ");
        lastName = scanner.nextLine();
        System.out.print("Input birthYear Person" + countPer + ": ");
        birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("Person_" + countPer + ": firstName = " + firstName + ", " +
                "lastName = " + lastName + ", birthYear = " + birthYear);
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    public void changeName(String fn) {
        firstName = fn;
    }

    public void changeName(String ln, int i) {
        lastName = ln;
    }

    public void getAge() {
        Scanner scanner = new Scanner(System.in);
        LocalDate dateNow = LocalDate.now();

        System.out.print("Input birthDay Person" + countPer + ": ");
        int birthDay = scanner.nextInt();
        System.out.print("Input birthMonth Person" + countPer + ": ");
        int birthMonth = scanner.nextInt();

        LocalDate datePerson = LocalDate.of(birthYear, birthMonth, birthDay);
        Period daysBetween = Period.between(datePerson, dateNow);

        int days = daysBetween.getDays();
        int months = daysBetween.getMonths();
        int years = daysBetween.getYears();
        System.out.println("Age of Person" + countPer + ": " + years + " years " + months + " months " + days + " days ");
    }
}
