package com.softserve.lesson01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson01Homework01 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double perimeterCircle;
            double areaCircle;

            System.out.print("Input the radius = ");
            double number = scanner.nextDouble();

            perimeterCircle = perimeter(number);
            areaCircle = area(number);
            System.out.printf("Perimeter = %.2f\nArea = %.2f", perimeterCircle, areaCircle);

        } catch (InputMismatchException ex) {
            System.out.println("Variable entered incorrectly");
        }
    }

    public static double perimeter(double numb) {
        return 2 * Math.PI * numb;
    }

    public static double area(double numb) {
        return Math.PI * Math.pow(numb, 2);
    }
}
