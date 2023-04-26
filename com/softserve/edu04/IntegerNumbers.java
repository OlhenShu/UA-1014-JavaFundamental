package com.softserve.edu04;

import java.util.Scanner;

/**
 * Input three integer numbers and output the maximum and minimum values of them to
 * the console.
 */
public class IntegerNumbers {
    private static int MIN = 0;
    private static int MAX = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        //the first number is set as standard
        setMIN(input.nextInt());
        setMAX(getMIN());

        System.out.print("Input second number: ");
        int second = input.nextInt();

        System.out.print("Input third number: ");
        int third = input.nextInt();

        input.close();

        checkNumber(second);
        checkNumber(third);

        System.out.printf("Minimum value: %d%n", getMIN());
        System.out.printf("Maximum value: %d%n", getMAX());
    }

    private static void checkNumber(int number) {
        isMin(number);
        isMax(number);
    }

    private static void isMin(int number) {
        if (number < MIN) {
            setMIN(number);
        }
    }

    private static void isMax(int number) {
        if (number > MAX) {
            setMAX(number);
        }
    }

    public static int getMIN() {
        return MIN;
    }

    public static void setMIN(int MIN) {
        IntegerNumbers.MIN = MIN;
    }

    public static int getMAX() {
        return MAX;
    }

    public static void setMAX(int MAX) {
        IntegerNumbers.MAX = MAX;
    }
}
