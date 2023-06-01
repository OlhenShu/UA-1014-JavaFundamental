package lesson14.homework;

import java.util.Optional;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        return nameCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        Employee empl1 = new Employee("Bob");
        Employee empl2 = new Employee("Din");
        Employee empl3 = new Employee("Sam");
        Employee empl4 = new Employee("Sam");

        Stream<Employee> employeeStream = Stream.of(empl1, empl2, empl3, empl4);
        Optional<String> mostPopularName = mostPopularName(employeeStream);

        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }
}

