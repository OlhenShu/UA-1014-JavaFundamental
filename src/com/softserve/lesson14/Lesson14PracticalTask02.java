package com.softserve.lesson14;

import java.util.*;

public class Lesson14PracticalTask02 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                .mapToInt((x) -> x).summaryStatistics();

        System.out.println("Count of all numbers : " + stats.getCount());
        System.out.println("Highest number in List : " + stats.getMax());

        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
    }
}
