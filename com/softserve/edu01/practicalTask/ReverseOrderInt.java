package com.softserve.edu01.practicalTask;

import java.util.Scanner;

public class ReverseOrderInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number: ");
        int first = scanner.nextInt();

        System.out.println("Input second number: ");
        int second = scanner.nextInt();

        System.out.println("Input third number: ");
        int third = scanner.nextInt();

        scanner.close();

        float average = (float) (first + second + third) / 3;
        System.out.printf("Average is %f", average);
    }
}
