package com.softserve.lesson01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson01Homework03 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double[][] arrCalls = new double[2][3];
            double sum = 0;

            for (int i = 0; i < 3; i++) {
                System.out.print("Input cost per minute from country_" + (i + 1) + " = ");
                arrCalls[0][i] = scanner.nextDouble();
                System.out.print("Input duration from country_" + (i + 1) + " = ");
                arrCalls[1][i] = scanner.nextDouble();
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("Cost call_" + (i + 1) + " = " + arrCalls[0][i] * arrCalls[1][i]);
                sum += arrCalls[0][i] * arrCalls[1][i];
            }
            System.out.println("Total cost = " + sum);

        } catch (InputMismatchException ex) {
            System.out.println("Variable entered incorrectly");
        }
    }
}
