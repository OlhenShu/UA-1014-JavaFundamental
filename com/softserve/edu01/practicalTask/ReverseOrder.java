package com.softserve.edu01.practicalTask;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input text:");
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        System.out.printf("Output text:%n %s %n %s %n %s", third, second, first);
    }
}
