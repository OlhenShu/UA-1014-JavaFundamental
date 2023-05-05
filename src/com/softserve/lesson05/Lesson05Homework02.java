package com.softserve.lesson05;

import java.util.Scanner;

public class Lesson05Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bl;
        do {
            System.out.print("Input number1 = ");
            int number1 = scanner.nextInt();
            System.out.print("Input number2 = ");
            int number2 = scanner.nextInt();

            System.out.println("summa = " + (number1 + number2));
            System.out.println("""
                    You want to perform the operation again
                    if want to perform the operation again  press 1
                    else press any number""");

            int tmp = scanner.nextInt();
            if (tmp == 1) {
                bl = true;
            } else {
                bl = false;
            }
        } while (bl);
    }
}
