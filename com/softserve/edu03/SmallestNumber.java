package com.softserve.edu03;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Input the first number: ");
            int smallestNumber = input.nextInt();

            System.out.print("Input the second number: ");
            int inputNumber = input.nextInt();

            if (inputNumber < smallestNumber) {
                smallestNumber = inputNumber;
            }

            System.out.print("Input the third number: ");
            inputNumber = input.nextInt();

            if (inputNumber < smallestNumber) {
                smallestNumber = inputNumber;
            }

            System.out.printf("The smallest number is %d", smallestNumber);
        } finally {
            input.close();
        }
    }
}
