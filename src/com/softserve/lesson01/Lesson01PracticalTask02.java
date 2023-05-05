package com.softserve.lesson01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson01PracticalTask02 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String[] arrStr = {"first", "second", "third"};
            double[] array = new double[3];
            double average = 0;

            for (int i = 0; i < 3; i++) {
                System.out.printf("Input %s number:\n", arrStr[i]);
                average += scanner.nextDouble();
            }
            System.out.println("Average is " + average / array.length);

        } catch (InputMismatchException ex) {
            System.out.println("Variable entered incorrectly");
        }
    }
}
