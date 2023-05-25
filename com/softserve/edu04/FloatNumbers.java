package com.softserve.edu04;

import java.util.Scanner;

/**
 * Input three float numbers and check: are they all belong to the range [-5, 5].
 */
public class FloatNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Input first number: ");
            float first = input.nextFloat();

            System.out.print("Input second number: ");
            float second = input.nextFloat();

            System.out.print("Input third number: ");
            float third = input.nextFloat();

            System.out.printf(inRange(first) + "%n" + inRange(second) + "%n" + inRange(third));
        } finally {
            input.close();
        }
    }

    private static String inRange(float number) {
        return String.format("The first number %s the range of numbers [-5, 5]", (number >= -5 && number <= 5) ? "is in" : "is not in");
    }
}
