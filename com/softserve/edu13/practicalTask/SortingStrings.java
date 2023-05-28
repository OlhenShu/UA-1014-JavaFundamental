package com.softserve.edu13.practicalTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a method using Java 8 for sorting a list of Strings.
 */
public class SortingStrings {
    static List<String> strings = new ArrayList<>(List.of(
            "Apple",
            "Orange",
            "Banana",
            "Kiwi"
    ));

    public static void main(String[] args) {
        System.out.println("Before sorting:");
        displayList();

        System.out.println("After sorting:");
        sort();
        displayList();
    }

    private static void sort() {
        strings.sort(String.CASE_INSENSITIVE_ORDER);
    }

    private static void displayList() {
        strings.forEach(System.out::println);
    }
}
