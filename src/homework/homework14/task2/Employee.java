package homework.homework14.task2;

import java.util.*;
import java.util.stream.Stream;

public class Employee {
    private String name;

    public Employee(String name) {
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
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
    public static void main(String[] args){
        Stream<Employee>  streamEmployees = Stream.of(
                new Employee("Din"),
                new Employee("Din"),
                new Employee("Bob"),
                new Employee("Sam"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Din")
                );

        System.out.println(mostPopularName(streamEmployees));
    }
    static Optional<String> mostPopularName(Stream<Employee> employees) {

        Map<String, Integer> nameCounts = employees
                .collect(HashMap::new, (map, employee) -> {
                    String name = employee.getName();
                    map.put(name, map.getOrDefault(name, 0) + 1);
                }, HashMap::putAll);

        return nameCounts.entrySet().stream()
                .reduce((a, b) -> a.getValue() > b.getValue() ? a : b)
                .map(Map.Entry::getKey);
    }
}

