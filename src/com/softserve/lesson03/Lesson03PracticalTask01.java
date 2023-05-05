package com.softserve.lesson03;

import java.util.Scanner;

public class Lesson03PracticalTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb1;
        int numb2;

        System.out.print("Enter the first number: ");
        numb1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        numb2 = scanner.nextInt();

        System.out.println("The sum of " + numb1 + " and " + numb2 + " is " + getTotal(numb1, numb2));
        System.out.println("The average of " + numb1 + " and " + numb2 + " is " + getAverage(numb1, numb2));
        System.out.print("Enter messages: ");
        String str = scanner.next();
        System.out.println("Number: " + getNumber(str));
    }

    static int getTotal(int a, int b) {
        return a + b;
    }

    static double getAverage(int a, int b) {
        return (a + b) / 2.0;
    }

    static double getNumber(String prompt) {
        char[] array = prompt.toCharArray();
        int count = 0;
        int countPoint = 0;
        double result;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= '0' && array[i] <= '9') count++;
            else if (array[i] == '.' && countPoint == 0) {
                count++;
                countPoint++;
            } else break;
        }

        char[] arrayStr = new char[count];
        for (int i = 0; i < count; i++) {
            arrayStr[i] = array[i];
        }
        String str = new String(arrayStr);
        result = Double.parseDouble(str);

        return result;
    }
}
