package com.softserve.edu14.practicalTask;

import java.util.stream.IntStream;

/**
 * For given collection List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
 * calculate count, min, max, sum, for numbers and print all results
 */
public class Primes {
    public static void main(String[] args) {
        var primes = IntStream.of(2, 3, 4, 5, 7, 11, 13, 17, 19, 23, 29);
        var stat = primes.summaryStatistics();

        System.out.printf("Max: %d", stat.getMax());
        System.out.printf("Min: %d", stat.getMin());
        System.out.printf("Count: %d", stat.getCount());
        System.out.printf("Sum: %d", stat.getSum());
        System.out.printf("Average: %s", stat.getAverage());
    }
}
