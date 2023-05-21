package com.softserve.edu11.practicalTask;

import java.util.Scanner;

//Input the last name, first name, and middle name as String variables on the console. The
//following outputs will be displayed on the console:
//• Last name and initials
//• First name
//• First name, middle name, and last name.
public class FullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = input.nextLine();

        System.out.println("Enter last name:");
        String lastName = input.nextLine();

        System.out.println("Enter middle name:");
        String middleName = input.nextLine();

        System.out.printf("Last name and initials: %s%n",
                getInitials(firstName, lastName, middleName));
        System.out.printf("First name: %s", firstName);
        System.out.printf("First name, middle name, and last name: %s %s %s",
                firstName,
                middleName,
                lastName);
    }

    /**
     * The method returns the full name and initials
     * @param firstName String
     * @param lastName String
     * @param middleName String
     * @return String
     */
    private static String getInitials(String firstName,
                                      String lastName,
                                      String middleName) {
        return String.format("%s %c. %c.",
                lastName,
                firstName.charAt(0),
                middleName.charAt(0));
    }
}
