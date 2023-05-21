package com.softserve.edu11;

import java.util.Random;
import java.util.Scanner;

//Create a console application that validates user input for their first and last name, ensuring that
//they only contain English letters, spaces, and hyphens. If the input data is incorrect, prompt the user
//to re-enter the data. Upon successful entry of the user's first and last names, generate a random
//greeting message that includes the user's name.
//To validate the user input, utilize String class methods, control loops, and regular expressions.
//Generate the random greeting message (use printf() method for output) by creating an array of
//phrases that contain various text options with the user's name inserted.
public class NameValidator {
    private final Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private final String[] greetingMessages = {
            "Hello, %s %s! Have a good day!%n",
            "Welcome, %s %s! Good evening to you!%n",
            "Hi, %s %s! Have a productive day!%n",
    };

    public static void main(String[] args) {
        new NameValidator();
        new NameValidator();
    }

    public NameValidator() {
        setFirstName();
        setLastName();

//        input.close();
        printHelloMessage();
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName() {
        this.firstName = validateName("first name");
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName() {
        this.lastName = validateName("last name");
    }

    public String[] getGreetingMessages() {
        return greetingMessages;
    }

    private String validateName(String fieldName) {
        String name = "";
        System.out.printf("Enter %s: ", fieldName);

        while ((name.isEmpty()) || (!isValidName(name))) {
            name = input.nextLine();

            if (!isValidName(name)) {
                System.out.printf("%nInvalid input. Please enter a valid %s: ", fieldName);
            }
        }

        return name;
    }

    private boolean isValidName(String name) {
        return name.matches("^[a-zA-Z\\s-]+$");
    }

    private void printHelloMessage() {
        int random = new Random().nextInt(getGreetingMessages().length);
        String greetingMessage = getGreetingMessages()[random];

        System.out.printf(greetingMessage, getFirstName(), getLastName());
    }
}
