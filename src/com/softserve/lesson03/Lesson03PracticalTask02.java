package com.softserve.lesson03;

import java.util.Scanner;

public class Lesson03PracticalTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countEmployee = 3;
        Employee[] employee = new Employee[countEmployee];

        for (int i = 0; i < countEmployee; i++) {
            employee[i] = new Employee();

            System.out.print("Input name Employee" + (i + 1) + ": ");
            employee[i].setName(scanner.next());
            System.out.print("Input rate Employee" + (i + 1) + ": ");
            employee[i].setRate(scanner.nextDouble());
            System.out.print("Input hours Employee" + (i + 1) + ": ");
            employee[i].setHours(scanner.nextInt());
        }

        for (int i = 0; i < countEmployee; i++) {
            Employee.totalSum += employee[i].getSalary();
            System.out.println(employee[i]);
        }

        System.out.print("Total salary = " + Employee.totalSum);
    }
}

class Employee {
    private String name;
    private double rate;
    private int hours;
    private int countEmployee = 0;

    public static double totalSum = 0;
    private static int count = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }


    public Employee() {
        count++;
        countEmployee = count;
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
        count++;
        countEmployee = count;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        count++;
        countEmployee = count;
    }

    public double getSalary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee" + countEmployee +
                ": name = " + name + " rate = " + rate + " hours = " + hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }
}
