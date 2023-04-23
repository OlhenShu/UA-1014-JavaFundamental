package com.softserve.edu03;

import java.util.Scanner;

public class SmallestNumber {
    private static int smallestNumber;
    private static int inputNumber;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        smallestNumber = input.nextInt();

        System.out.print("Input the second number: ");
        inputNumber = input.nextInt();

        if (inputNumber < smallestNumber) {
            smallestNumber = inputNumber;
        }

        System.out.print("Input the third number: ");
        inputNumber = input.nextInt();

        if (inputNumber < smallestNumber) {
            smallestNumber = inputNumber;
        }

        System.out.println("The smallest number is " + smallestNumber);
    }
}
