package com.softserve.lesson12;

import java.util.Scanner;

public class Lesson12PracticalTask01 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input a: ");
            int a = scanner.nextInt();

            System.out.print("Input b: ");
            int b = scanner.nextInt();

            if (a < 0 || b < 0) {
                throw new Exception();
            }
            System.out.println("Area of a rectangle = "+SquareRectangle(a, b));

        } catch (RuntimeException e) {
            System.out.println("RuntimeException");

        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static int SquareRectangle(int a, int b) {
        return a * b / 2;
    }
}
