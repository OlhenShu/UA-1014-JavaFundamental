package com.softserve.lesson01;

import java.util.Scanner;

public class Lesson01PracticalTask03 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int sumNumb;
            int subtNumb;
            int multNumb;
            double divNumb;

            System.out.print("Input integer variable a: ");
            String str1 = scanner.nextLine();
            int a = Integer.parseInt(str1);
            System.out.print("Input integer variable b: ");
            String str2 = scanner.nextLine();
            int b = Integer.parseInt(str2);

            sumNumb = sum(a, b);
            subtNumb = subt(a, b);
            multNumb = mult(a, b);
            divNumb = div(a, b);
            System.out.printf("Output obtained results:\na+b=%d\na-b=%d\na*b=%d\na/b=%.2f", sumNumb, subtNumb, multNumb, divNumb);

        } catch (NumberFormatException ex) {
            System.out.println("Variable entered incorrectly");
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subt(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        return a * 1.0 / b;
    }
}
