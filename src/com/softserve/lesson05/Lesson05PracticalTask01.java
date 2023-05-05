package com.softserve.lesson05;

import java.util.Arrays;
import java.util.Scanner;


public class Lesson05PracticalTask01 {
    public static void main(String[] args) throws RuntimeException {
        sortArray();
        averageArray();
    }

    public static void sortArray() {
        Scanner scanner = new Scanner(System.in);
        int countArray = 5;
        String[] arr = new String[countArray];

        for (int i = 0; i < countArray; i++) {
            System.out.println("Input string ");
            arr[i] = scanner.next();
        }

        Arrays.sort(arr);
        for (int i = 0; i < countArray; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void averageArray() {
        Scanner scanner = new Scanner(System.in);
        int countArray = 5;
        double[] arr = new double[countArray];
        double aver = 0;

        for (int i = 0; i < countArray; i++) {
            System.out.println("Input number array");
            arr[i] = scanner.nextDouble();
            aver += arr[i];
        }
        System.out.println(aver / countArray);

        System.out.println("Input number");
        double numb = Double.parseDouble(scanner.next());
        int index = Arrays.binarySearch(arr, numb);

        if (index >= 0) {
            System.out.println("Position of element " + index);
        }
        scanner.close();
    }
}
