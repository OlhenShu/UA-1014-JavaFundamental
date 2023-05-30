package com.softserve.lesson12;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson12Homework02 {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = new int[10];

        int x;
        int start = 2;
        int end = 90;

        while (count != 10) {
            x = readNumber(start, end);

            if (x != 0) {
                arr[count] = x;
                start = x + 1;
                end++;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int readNumber(int start, int end) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input Number = ");
            int x = scanner.nextInt();

            if (x >= start && x <= end) {
                return x;
            } else {
                System.out.println("Number isn't in the range ["+start+"..."+end+"]");
                return 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
            return 0;
        }
    }
}
