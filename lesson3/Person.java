package com.lesson3;

import java.util.Scanner;



public class Person {
    static Scanner sc = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int birthYear;


    public Person(){
        this.firstName = "";
        this.lastName = "";
        this.birthYear = 0;
    }
    public Person(String fn, String ln, int by){
        this.firstName = fn;
        this.lastName = ln;
        this.birthYear = by;
    }
    public String getFirstname()
    {
        return this.firstName;
    }
    public void setFirstname(String fn) {
        this.firstName = fn;
    }
    public String getLastname()
    {
        return this.lastName;
    }
    public void setLastname(String ln) {
        this.lastName = ln;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int getAge(){
        return 2023 - this.birthYear;
    }
    public String toString(){
        return "Person ["+"[" + this.firstName + "] [" + this.lastName + "], age: " + this.getAge() +
               ", birth year: "+ this.birthYear + "]";
    }
    public void input(){
        System.out.println("Enter name for person: ");
        this.firstName = sc.nextLine();
        System.out.println("Enter last name for person: ");
        this.lastName = sc.nextLine();
        System.out.println("Enter birth year for person: ");
        this.birthYear = sc.nextInt();
    }
    public void output(){
        System.out.println(this.toString());
    }
    public void changeName(){
        System.out.println("What would you like to change? (1 - first name, 2 - last name, 3 - both): ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice  == 1){
            System.out.println("Enter name: ");
            this.firstName = sc.nextLine();
        }
        if (choice  == 2){
            System.out.println("Enter last name: ");
            this.lastName = sc.nextLine();
        }
        if (choice  == 3){
            System.out.println("Enter name: ");
            this.firstName = sc.nextLine();
            System.out.println("Enter last name: ");
            this.lastName = sc.nextLine();
        }
    }


}




