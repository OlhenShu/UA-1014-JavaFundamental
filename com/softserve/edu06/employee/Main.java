package com.softserve.edu06.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Vasyl", 25, 25000);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
