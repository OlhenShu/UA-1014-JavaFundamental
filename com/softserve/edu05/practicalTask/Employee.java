package com.softserve.edu05.practicalTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Create a class called Employee with fields: name, department number, salary.
 * • In main() method create five objects of class Employee.
 * • Output results for:
 * all employees of a certain department (input department number in the console);
 * arrange workers by the field salary in descending order.
 */
public class Employee {
    private final String name;
    private final int departmentNumber;
    private final double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee[] employees = {
                new Employee("Oleksandr", 2, 6000),
                new Employee("Eva", 2, 8000),
                new Employee("Bob", 3, 450),
                new Employee("Anna", 1, 200),
                new Employee("Denys", 1, 900)
        };

        System.out.print("Input department number: ");
        int department = input.nextInt();
        input.close();

        employeesByDepartment(employees, department);
        sortedEmployeesByDescending(employees);
    }

    private static void employeesByDepartment(Employee[] employees, int departmentNumber) {
        for (Employee employee : employees) {
            if (departmentNumber == employee.getDepartmentNumber()) {
                System.out.printf("Employee: %s, Department: %d, Salary: %.2f%n",
                        employee.getName(), employee.getDepartmentNumber(), employee.getSalary());
            }
        }
    }

    private static void sortedEmployeesByDescending(Employee[] employees) {
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()));
        System.out.println("Sorted employees by descending: ");

        for (Employee employee : employees) {
            System.out.printf("Employee: %s, Department: %d, Salary: %.2f%n",
                    employee.getName(), employee.getDepartmentNumber(), employee.getSalary());
        }
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }
}
