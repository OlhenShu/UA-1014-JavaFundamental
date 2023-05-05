package com.softserve.lesson05;

import java.util.Scanner;

public class Lesson05Homework04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 2000 - 1000);
        int tmp;
        System.out.println("Input number: ");

        do {
            tmp = scanner.nextInt();

            if (tmp > randomNumber) {
                System.out.println("Too high, try again");
            }

            if (tmp < randomNumber) {
                System.out.println("Too low, try again");
            }

            if (tmp == randomNumber) {
                System.out.println("Guessed right");
                break;
            }
        } while (true);
    }
}
