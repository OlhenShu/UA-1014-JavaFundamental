package com.softserve.edu07.payment;

public abstract class Employee implements Payment, Comparable<Employee> {
    private String employeeId;

    public Employee(String employeeId) {
        setEmployeeId(employeeId);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public abstract String getName();

    @Override
    public int compareTo(Employee o) {
        double wage1 = this.calculatePay();
        double wage2 = o.calculatePay();
        return Double.compare(wage2, wage1);
    }
}
