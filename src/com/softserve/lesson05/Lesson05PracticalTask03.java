package com.softserve.lesson05;

import java.util.Arrays;

public class Lesson05PracticalTask03 {
    public static void main(String[] args) {
        int countArray = 10;
        int[] array = new int[countArray];
        int sum = 0;
        int numbNegative = 0;
        int numbPositive = 0;

        for (int i = 0; i < countArray; i++) {
            array[i] = (int) (Math.random() * 1000 - 500);
            if (array[i] > 0) {
                sum += array[i];
                numbPositive++;
            }
            if (array[i] < 0) {
                numbNegative++;
            }
            System.out.println(array[i]);
        }

        Arrays.sort(array);
        System.out.println("The biggest number in the array " + array[countArray - 1]);
        System.out.println("The sum of positive numbers " + sum);
        System.out.println("Count the number of negative numbers " + numbNegative);

        if (numbPositive > numbNegative) {
            System.out.println("There are more positive values in the array");
        } else if (numbNegative > numbPositive) {
            System.out.println("There are more negative values in the array");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }

    }
}
