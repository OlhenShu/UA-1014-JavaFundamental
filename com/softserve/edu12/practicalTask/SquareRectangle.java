package com.softserve.edu12.practicalTask;

import java.util.Scanner;

/**
 * It is required to create a method named squareRectangle that takes two integer parameters "a" and "b" and
 * calculates the area of a rectangle: int squareRectangle (int a, int b),
 * In case the user enters negative values, the method should throw an exception. The values of "a" and "b" should be
 * taken as input from the console. It is recommended to check the correctness of the squareRectangle() method in the
 * main() method. Furthermore, it is necessary to verify that the input values are numeric and handle non-numeric
 * input accordingly.
 */
public class SquareRectangle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the length of rectangle: ");
            int a = input.nextInt();

            System.out.print("Enter the width of rectangle: ");
            int b = input.nextInt();

            System.out.printf("The area of a rectangle: %d%n", squareRectangle(a, b));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Enter the number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int squareRectangle(int a, int b) {
        if (a > 0 || b > 0) {
            throw new IllegalArgumentException("Parameters must be positive integers.");
        }
        return a*b;
    }
}
