package com.softserve.edu06.employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Vasyl", 25, 25000),
                new Developer("Taras", 32, 32735.35, "Average Java developer"),
                new Developer("Devid", 26, 28000.35, "Frontend developer"),
                new Employee("Ann", 24, 36000),
        };

        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}
