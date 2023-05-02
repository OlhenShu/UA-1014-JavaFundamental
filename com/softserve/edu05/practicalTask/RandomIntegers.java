package com.softserve.edu05.practicalTask;

import java.util.Random;

/**
 * Create an array of ten random integers using a random number generator. Output:
 * • the biggest number in the array;
 * • the sum of positive numbers;
 * • count the number of negative numbers.
 * • determine whether there are more negative or positive values in the array. If there are
 * more negative values, output "There are more negative values in the array." Otherwise,
 * output "There are more positive values in the array." If the counts are equal, output
 * "There are an equal number of positive and negative values in the array.
 */
public class RandomIntegers {
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers(10);

        int biggestNumber = 0;
        int positiveNumbers = 0;
        int countPositiveNumbers = 0;
        int countNegativeNumbers = 0;

        for (int number : randomNumbers) {
            //the biggest number in the array
            if (biggestNumber < number) {
                biggestNumber = number;
            }
            //the sum of positive numbers
            if (number > 0) {
                positiveNumbers += number;
                countPositiveNumbers++;
            } else {
                //count the number of negative numbers.
                countNegativeNumbers++;
            }
        }

        if (countPositiveNumbers > countNegativeNumbers) {
            System.out.println("There are more positive values in the array.");
        } else if (countPositiveNumbers < countNegativeNumbers) {
            System.out.println("There are more negative values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }

        System.out.printf("Sum positive numbers: %s", positiveNumbers);
    }

    private static int[] randomNumbers(int count) {
        int[] randomNumbers = new int[count];

        Random random = new Random();

        for (int i = 0; i < count; i++) {
            randomNumbers[i] = random.nextInt(200) - 100;
        }

        return randomNumbers;
    }
}
