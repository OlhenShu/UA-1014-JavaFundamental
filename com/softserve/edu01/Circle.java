package com.softserve.edu01;

import java.util.Scanner;

/**
 * Task: Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius
 * from the console, and output obtained results.
 */
public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        System.out.println("Area of the circle is " + area(radius));
        System.out.println("Perimeter of the circle is " + perimeter(radius));
    }

    private static double area(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    private static double perimeter(double r) {
        return 2 * Math.PI * r;
    }
}
