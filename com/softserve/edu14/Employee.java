package com.softserve.edu14;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Realize method
 * static Optional<String> mostPopularName(Stream< Employee> employees) {
 * return null;     }
 * For given a stream with objects of Employee class, return the optional, containing the most popular name. If this stream is empty, Optional.empty should be returned. For example:
 * empl1.name = “Bob”, empl2.name = “Din”,
 * empl3.name = “Sam”, empl4.name = “Sam”
 * “Sam” should be returned.
 */
public class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        System.out.printf("Most Popular Name: %s",
                mostPopularName(employees).orElse("none"));
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        return nameCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
