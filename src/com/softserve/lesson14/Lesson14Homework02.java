package com.softserve.lesson14;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Lesson14Homework02 {
    public static void main(String[] args) {
        List<Employees> list = new ArrayList<>();

        list.add(new Employees("Bob"));
        list.add(new Employees("Din"));
        list.add(new Employees("Sam"));
        list.add(new Employees("Sam"));

        Stream<Employees> employees = list.stream();
        System.out.println(Employees.mostPopularName(employees));
    }
}

class Employees {
    private String name;

    public Employees() {
    }

    public Employees(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employee = (Employees) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    static Optional<String> mostPopularName(Stream<Employees> employees) {

        List<Employees> duplicates = employees
                .collect(Collectors.groupingBy(Function.identity()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        Optional<String> result = Optional.ofNullable(duplicates.get(0).getName());
        return result;
    }

}