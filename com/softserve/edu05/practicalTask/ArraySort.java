package com.softserve.edu05.practicalTask;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * Write a Java program that performs the following tasks and outputs the results:
 * • Create a string array and sort it.
 * • Create an array with 5 elements and calculate the average value
 * • Сheck if the array (any of the previous ones) contains the value ( value enter from the
 * console). Output the result of the search.
 */
public class ArraySort {
    public static void main(String[] args) {
        // sorting string array
        String[] names = {"Oleksandr", "Mark", "Denys", "Alise", "Ann"};

        System.out.println(toSortedStringNames(names));

        // calculate avg
        int[] numbers = {3, 5, 9, 1, 20};

        System.out.printf("Numbers AVG: %.2f%n", avg(numbers));

        // contains the value
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value: ");
        String inputValue = input.nextLine();
        input.close();

        System.out.println(inArray(inputValue, names));
    }

    private static String toSortedStringNames(String[] arrayString) {
        Arrays.sort(arrayString);

        return String.format("Sorted names: %s", Arrays.toString(arrayString));
    }

    private static double avg(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    private static String inArray(String needle, String[] names) {
        for (String name : names) {
            if (Objects.equals(name, needle)) {
                return String.format("The value you entered (%s) is contained in an array names", needle);
            }
        }


        return String.format("The value you entered (%s) was not found in the array", needle);
    }
}
