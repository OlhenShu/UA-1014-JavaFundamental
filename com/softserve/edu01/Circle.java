package com.softserve.edu01;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Task: Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius
 * from the console, and output obtained results.
 */
public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the radius of the circle:");
            double radius = scanner.nextDouble();

            System.out.printf("Area of the circle is %.2f%n", area(radius));
            System.out.printf("Perimeter of the circle is %.2f%n", perimeter(radius));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter radius.");
        } finally {
            scanner.close();
        }
    }

    private static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private static double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
