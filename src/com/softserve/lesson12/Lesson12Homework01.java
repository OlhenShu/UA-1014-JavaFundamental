package com.softserve.lesson12;

import java.util.Scanner;

public class Lesson12Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x = ");
        double x = scanner.nextDouble();

        System.out.print("Input y = ");
        double y = scanner.nextDouble();

        double z = div(x, y);
        System.out.println("x/y = " + z);
    }

    public static double div(double x, double y) {
        try {
            int z = ((int) x) / ((int) y);
            return x / y;
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero ");
            return 0;
        }
    }
}
