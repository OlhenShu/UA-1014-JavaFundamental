package com.softserve.edu01;

import java.util.Scanner;

/**
 * Define two String variables name and address. Output question "What is your name?
 * to the console. Read the value of name and output next question: “Where do you live,
 * (name)?“ to the console. Read the value of address from the console and output the
 * complete information.
 */
public class PersonalData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Where do you live, " + name + "?");
        String from = scanner.nextLine();

        System.out.println("Your name is: " + name + "\nYour live in " + from);
    }
}
