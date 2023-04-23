package Homework.Person;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private  String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getBirthYear() {
        Year year=Year.now();
        return year.getValue() - birthYear;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name");
        firstName = scanner.nextLine();

        System.out.println("Enter last name");
        lastName = scanner.nextLine();

        System.out.println("Enter birth");
        birthYear = scanner.nextInt();

        scanner.close();

    }

    public void output() {
        System.out.println("\n Your name is " + firstName +
                "\n Your surname is " + lastName +
                "\n Your birth year is " + birthYear +
                "\n Your age is  " + getBirthYear() +
                "\n ===============================");

    }
    public void changeName(String fn, String ln) {
        lastName = ln;
        firstName = fn;

    }
    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setLastName(String lastName) {this.lastName = lastName;}
}
