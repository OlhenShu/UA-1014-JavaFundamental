package com.softserve.edu13.practicalTask;

import java.util.List;
import java.util.function.IntPredicate;

/**
 * Create an array of Integer objects containing ten elements. Implement a method
 * named count() that takes an array of Integer objects as its first parameter and a
 * functional interface that operates on integers and defines a condition as its second
 * parameter. The count() method should return the number of elements in the array
 * that satisfy the condition specified by the second parameter.
 */
public class IntegerCounter {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 1, 3, 4, 5, 6);

        System.out.println(count(list, i -> i >= 4));
        System.out.println(count(list, i -> i % 2 == 0));
    }

    private static int count(List<Integer> list, IntPredicate condition) {
        int res = 0;
        for (var el : list) {
            if (condition.test(el)) {
                res++;
            }
        }

        return res;
    }
}
