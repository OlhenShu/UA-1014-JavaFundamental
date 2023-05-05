package com.softserve.lesson05;

import java.util.Scanner;

public class Lesson05Homework01 {
    public static void main(String[] args) {
        Month month = new Month();
        month.monthNumber();

        Numbers10 numbers10 = new Numbers10();
        numbers10.input();
        numbers10.sumOrPro();

        Numbers5 numbers5 = new Numbers5();
        numbers5.input();
        numbers5.secondPositive();
        numbers5.minimumValue();
        numbers5.calculateProduct();
    }
}

class Month {
    int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public void monthNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number month = ");
        int numb = scanner.nextInt();

        if (numb != 2) {
            System.out.println("Days in that month " + day[numb - 1]);
        } else {
            System.out.println("Leap year?\nYes: press 1\nNo: press 0");
            int count = scanner.nextInt();
            if (count == 0) {
                System.out.println("Days in february " + day[1]);
            }
            if (count == 1) {
                System.out.println("Days in february " + (day[1] + 1));
            }
        }
    }
}

class Numbers10 {
    int[] arr = new int[10];

    public void input() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Input number = ");
            arr[i] = scanner.nextInt();
        }
    }

    public void sumOrPro() {
        int sum = 0;
        int pro = 1;
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }

        if (count == 0) {
            for (int i = 0; i < 5; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
        } else {
            for (int i = 5; i < 10; i++) {
                pro *= arr[i];
            }
            System.out.println(pro);
        }
    }
}

class Numbers5 {
    int[] arr = new int[5];

    public void input() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Input number = ");
            arr[i] = scanner.nextInt();
        }
    }

    public void secondPositive() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("Position of second positive number " + i);
                break;
            }
        }
    }

    public void minimumValue() {
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < 5; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Minimum value " + min + " Position in the array " + index);
    }

    public void calculateProduct() {
        int prod = 1;
        for (int i = 0; i < 5; i += 2) {
            if (arr[i] != 0) {
                prod *= arr[i];
            }
        }
        System.out.println("Product of all entered even numbers " + prod);
    }
}
