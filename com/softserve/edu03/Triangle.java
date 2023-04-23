package com.softserve.edu03;

import java.util.Scanner;

public class Triangle {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public static void main(String[] args) {
        new Triangle();
    }

    public Triangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input side 1: ");
        this.sideA = scanner.nextDouble();

        System.out.print("Input side 2: ");
        this.sideB = scanner.nextDouble();

        System.out.print("Input side 3: ");
        this.sideC = scanner.nextDouble();

        System.out.println("Area of triangle: " + calculateArea());
    }

    public double calculateArea() {
        double p = semiPerimeter();

        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    private double semiPerimeter() {
        return (sideA + sideB + sideC) / 2;
    }
}
