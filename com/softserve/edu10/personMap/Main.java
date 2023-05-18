package com.softserve.edu10.personMap;

import java.util.Scanner;

import static com.softserve.edu10.personMap.PersonMap.*;

public class Main {
    public static void main(String[] args) {
        populatePersonMap();
        System.out.println("Person map:");
        displayPersonMap();

        System.out.printf("Are there at least two persons with the same first name among these ten people? (%s)%n",
                checkDuplicateFirstName());

        Scanner input = new Scanner(System.in);

        String removeName = input.nextLine();
        input.close();

        removePersonByFirstName(removeName);

        System.out.printf("Map after removing person with first name %s:%n'", removeName);
        displayPersonMap();
    }
}
