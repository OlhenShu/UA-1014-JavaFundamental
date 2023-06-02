package com.softserve.lesson14;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class Lesson14PracticalTask01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");

        var count = list.stream()
                .filter(String::isEmpty)
                .count();

        var nonEmtyStrings = list.stream()
                .filter(not(String::isEmpty))
                .collect(Collectors.toList());

        var comaSeparaterStrings = list.stream()
                .filter(not(String::isEmpty))
                .collect(Collectors.joining(","));

        System.out.println("Empty strings: " + count);
        System.out.println(nonEmtyStrings);
        System.out.println(comaSeparaterStrings);
    }
}
