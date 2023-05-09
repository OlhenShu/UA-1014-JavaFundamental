package com.softserve.lesson07;

import java.util.*;

public class Lesson07Homework01 {
    public static void main(String[] args) {
        int countEmployee = 10;
        Employee[] employees = new Employee[countEmployee];
        Random random = new Random();

        for (int i = 0; i < countEmployee; i++) {
            int tmp = random.nextInt(2) + 1;

            employees[i] = switch (tmp) {
                case 1 -> new SalariedEmployee();
                case 2 -> new ContractEmployee();
                default -> throw new IllegalStateException("Unexpected value: " + tmp);
            };

            if (employees[i] instanceof SalariedEmployee) {
                ((SalariedEmployee) employees[i]).input();
            }
            if (employees[i] instanceof ContractEmployee) {
                ((ContractEmployee) employees[i]).input();
            }
        }

        for (int i = 0; i < countEmployee; i++) {
            System.out.println(employees[i]);
        }

        Employee[] employees1 = new Employee[countEmployee];
        for (int i = 0; i < countEmployee; i++) {
            employees1[i] = new Employee() {
            };
            employees1[i].employeeld=employees[i].getClass().getSimpleName();
            if (employees[i] instanceof SalariedEmployee){
                employees1[i].setID(((SalariedEmployee) employees[i]).getSocialSecurityNumber());
            }
            if (employees[i] instanceof ContractEmployee){
                employees1[i].setID(((ContractEmployee) employees[i]).getFederalTaxIdmember());
            }
            employees1[i].setAverageMonthlySalary(employees[i].getAverageMonthlySalary());
            employees1[i].setName(employees[i].getName());
        }

        Arrays.sort(employees1);
        System.out.println();

        for (int i = countEmployee - 1; i >= 0; i--) {
            System.out.println(employees1[i]);
        }
    }
}

abstract class Employee implements Comparable<Employee> {
    String employeeld;
    private String ID;
    private String name;
    private double averageMonthlySalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public void setAverageMonthlySalary(double averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public int compareTo(Employee employee) {
        if (Double.compare(this.averageMonthlySalary, employee.averageMonthlySalary) != 0) {
            return Double.compare(this.averageMonthlySalary, employee.averageMonthlySalary);
        } else {
            return this.name.compareTo(employee.name);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld='" + employeeld + '\'' +
                ", ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", averageMonthlySalary=" + averageMonthlySalary +
                '}';
    }
}

interface Payment {
    double calculatePay();
}

class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private String name;
    private double averageMonthlySalary;
    private double fixedMonthlyPayment;

    Random random = new Random();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    @Override
    public void setAverageMonthlySalary(double averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String inputsocialSecurityNumber() {
        socialSecurityNumber = "";

        for (int i = 0; i < 10; i++) {
            int tmp = random.nextInt(10);
            socialSecurityNumber += tmp;
        }
        return socialSecurityNumber;
    }

    public String inputName() {
        char tmp = (char) (random.nextInt(25) + 65);
        name = "" + tmp;

        for (int i = 0; i < 5; i++) {
            tmp = (char) (random.nextInt(25) + 97);
            name += tmp;
        }
        return name;
    }

    public double inputfixedMonthlyPayment() {
        fixedMonthlyPayment = random.nextDouble() * 20000;
        return fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        averageMonthlySalary = inputfixedMonthlyPayment();
        return averageMonthlySalary;
    }

    public void input() {
        socialSecurityNumber = inputsocialSecurityNumber();
        name = inputName();
        averageMonthlySalary = calculatePay();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", name='" + name + '\'' +
                ", averageMonthlySalary=" + averageMonthlySalary +
                '}';
    }
}

class ContractEmployee extends Employee implements Payment {
    private String FederalTaxIdmember;
    private String name;
    private double averageMonthlySalary;
    private double hourlyRate;
    private int numberOfHoursWorked;

    Random random = new Random();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    @Override
    public void setAverageMonthlySalary(double averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }

    public String getFederalTaxIdmember() {
        return FederalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        FederalTaxIdmember = federalTaxIdmember;
    }

    public String inputFederalTaxIdmember() {
        FederalTaxIdmember = "";

        for (int i = 0; i < 10; i++) {
            int tmp = random.nextInt(10);
            FederalTaxIdmember += tmp;
        }
        return FederalTaxIdmember;
    }

    public String inputName() {
        char tmp = (char) (random.nextInt(25) + 65);
        name = "" + tmp;

        for (int i = 0; i < 5; i++) {
            tmp = (char) (random.nextInt(25) + 97);
            name += tmp;
        }
        return name;
    }

    public double inputHourlyRate() {
        hourlyRate = random.nextDouble() * 100;
        return hourlyRate;
    }

    public double inputnumberOfHoursWorked() {
        numberOfHoursWorked = random.nextInt(200);
        return numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        averageMonthlySalary = inputHourlyRate() * inputnumberOfHoursWorked();
        return averageMonthlySalary;
    }

    public void input() {
        FederalTaxIdmember = inputFederalTaxIdmember();
        name = inputName();
        averageMonthlySalary = calculatePay();
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "FederalTaxIdmember='" + FederalTaxIdmember + '\'' +
                ", name='" + name + '\'' +
                ", averageMonthlySalary=" + averageMonthlySalary +
                '}';
    }
}