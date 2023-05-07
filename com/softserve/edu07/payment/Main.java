package com.softserve.edu07.payment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("1", "Ann", "123123", 12000),
                new ContractEmployee("2", "Bob", "22222", 22, 160),
                new SalariedEmployee("3", "Ceed", "777777", 9000),
                new ContractEmployee("4", "Mary", "757575", 58, 175)
        };

        Arrays.sort(employees);

        for (Employee employee : employees) {
            System.out.printf("Employee ID: %s, Name: %s, Average monthly wage: %.2f%n",
                    employee.getEmployeeId(), employee.getName(), employee.calculatePay());
        }
    }
}
