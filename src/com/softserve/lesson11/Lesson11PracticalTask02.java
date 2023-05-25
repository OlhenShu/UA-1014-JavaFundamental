package com.softserve.lesson11;

import java.util.Scanner;

public class Lesson11PracticalTask02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String firstName = scanner.nextLine();
        String middleName = scanner.nextLine();
        String lastName = scanner.nextLine();

        System.out.println(String.format("%s %c. %c. ",
                lastName,
                firstName.charAt(0),
                middleName.charAt(0)));

        System.out.println(firstName);

        System.out.println(firstName+" "+middleName+" "+lastName);
    }
}
