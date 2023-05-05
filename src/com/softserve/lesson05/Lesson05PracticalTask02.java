package com.softserve.lesson05;

import java.util.Scanner;

public class Lesson05PracticalTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive integer number ");
        int number = scanner.nextInt();
        int count = 0;

        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Is a prime number");
        } else {
            System.out.println("Is not prime number");
        }
    }
}

