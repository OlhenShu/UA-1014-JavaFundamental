package com.softserve.edu01.practicalTask;

import java.util.Scanner;

public class Dialog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How are you?");
        String answer = scanner.nextLine();

        scanner.close();

        System.out.printf("Your are %s", answer);
    }
}
