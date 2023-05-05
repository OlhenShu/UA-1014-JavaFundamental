package com.softserve.lesson03;

import java.util.Scanner;

public class Lesson03Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();

        System.out.print("Input Size 1: ");
        triangle.setSize1(scanner.nextDouble());
        System.out.print("Input Size 2: ");
        triangle.setSize2(scanner.nextDouble());
        System.out.print("Input Size 3: ");
        triangle.setSize3(scanner.nextDouble());

        System.out.println("The area of a triangle is " + triangle.area());
    }
}

class Triangle {
    private double size1;
    private double size2;
    private double size3;

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double area() {
        double p = (size1 + size2 + size3) / 2;
        return Math.sqrt(p * (p - size1) * (p - size2) * (p - size3));
    }
}
