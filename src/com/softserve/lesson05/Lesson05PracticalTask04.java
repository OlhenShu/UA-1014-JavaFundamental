package com.softserve.lesson05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson05PracticalTask04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countEmployee = 5;
        Employee[] employee = new Employee[countEmployee];
        ArrayList<Employee> arrayList = new ArrayList<>();

        for (int i = 0; i < countEmployee; i++) {
            employee[i] = new Employee();
            System.out.print("Input name Employee: ");
            employee[i].setName(scanner.next());
            System.out.print("Input department number Employee: ");
            employee[i].setDepartmentNumber(scanner.nextInt());
            System.out.print("Input salary Employee: ");
            employee[i].setSalaryEmploee(scanner.nextDouble());
        }

        System.out.println("Input department number");
        int number = scanner.nextInt();
        int count = 0;
        for (Employee emp : employee) {
            if (emp.getDepartmentNumber() == number) {
                arrayList.add(emp);
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            for (int j = count - 1; j > i; j--) {
                if (arrayList.get(j - 1).getSalaryEmploee() > arrayList.get(j).getSalaryEmploee()) {
                    double tmp = arrayList.get(j - 1).getSalaryEmploee();
                    arrayList.get(j - 1).setSalaryEmploee(arrayList.get(j).getSalaryEmploee());
                    arrayList.get(j).setSalaryEmploee(tmp);
                }
            }
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}

class Employee {
    private String name;
    private int departmentNumber;
    private double salaryEmploee;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getSalaryEmploee() {
        return salaryEmploee;
    }

    public void setSalaryEmploee(double salaryEmploee) {
        this.salaryEmploee = salaryEmploee;
    }

    public Employee() {
    }

    public Employee(String name, int departmentNumber, double salaryEmploee) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salaryEmploee = salaryEmploee;
    }

    @Override
    public String toString() {
        return "Employee: name = " + name + " department number = " + departmentNumber + " salary = " + salaryEmploee;
    }
}


