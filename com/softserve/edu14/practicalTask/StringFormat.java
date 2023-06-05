package com.softserve.edu14.practicalTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

/**
 * Suppose you have  next list
 * List<String> list = Arrays.asList("bla", "", "simp",
 * "", "second", "third", "third", "sec", "blablabla");
 * Print how many empty strings are in this list
 * Remove all empty Strings from list and print the result
 * Convert String to uppercase and Join them with coma. Print the result
 */
public class StringFormat {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");

        System.out.printf("Count empty strings: %s%n", StringFormat.countEmptyStrings(list));
        System.out.printf("Non empty strings: %s%n", StringFormat.getNonEmptyStrings(list));
        System.out.printf("Comma separated strings: %s%n", StringFormat.getCommaSeparatedStrings(list));
    }

    public static long countEmptyStrings(List<String> list) {
        return list.stream().filter(String::isEmpty).count();
    }

    public static List<String> getNonEmptyStrings(List<String> list) {
        return list.stream()
                .filter(not(String::isEmpty))
                .toList();
    }

    public static String getCommaSeparatedStrings(List<String> list) {
        return list.stream()
                .filter(not(String::isEmpty))
                .collect(Collectors.joining(", ", "[", "]"));
    }
}
