package com.softserve.lesson06;

import java.util.Scanner;

public class Lesson06Homework02 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Employee");
        employee.input();
        System.out.println(employee.report());

        Developer developer = new Developer();
        System.out.println("Developer");
        developer.input();
        System.out.println(developer.report());

        Employee employeeDeveloper = new Developer();
        System.out.println("Employee Developer");
        employeeDeveloper.input();
        System.out.println(employeeDeveloper.report());
    }
}

class Employee {
    private String name;
    private int age;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        name = scanner.next();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Salary: ");
        salary = scanner.nextDouble();
    }

    public String report() {
        return String.format("Name: %s, Age: %dyears," +
                "Salary: \u20B4 %.2f.", name, age, salary);
    }
}

class Developer extends Employee {
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Position: ");
        position = scanner.next();
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %dyears, Position: %s, " +
                "Salary: \u20B4 %.2f.", getName(), getAge(), position, getSalary());
    }
}
