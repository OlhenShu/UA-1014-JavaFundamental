package com.softserve.edu03.practicalTask;

import java.util.Scanner;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static int totalSum;

    public static void main(String[] args) {
        Employee employeeFirst = new Employee("Input first employee data");
        Employee employeeSecond = new Employee("Maxim", 25, 180);
        Employee employeeThird = new Employee("Evgenii", 7.4, 154.5);

        System.out.printf("Employees: %n%s%n%s%n%s%n", employeeFirst, employeeSecond, employeeThird);
        System.out.printf("Total sum: %s", Employee.getTotal());
    }

    public Employee() {
    }

    public Employee(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        System.out.print("Input name: ");
        this.name = scanner.nextLine();

        System.out.print("Input rate: ");
        this.rate = scanner.nextDouble();

        System.out.print("Input hours: ");
        this.hours = scanner.nextDouble();

        scanner.close();

        setTotal();
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;

        setTotal();
    }

    private void setTotal() {
        totalSum += getSalary();
    }

    private static double getTotal() {
        return totalSum;
    }

    private double getSalary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Rate: %.2f, Hours: %.2f, Salary: %.2f, Bonuses: %.2f", name, rate, hours, getSalary(), getBonuses());
    }

    private double getBonuses() {
        return getSalary() * 0.1;
    }
}
