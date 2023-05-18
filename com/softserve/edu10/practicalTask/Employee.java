package com.softserve.edu10.practicalTask;

import java.util.Objects;

public class Employee {
    private String name;
    private String position;
    private double salary;
    private String dateOfBirth;

    public Employee(String name, String position, double salary, String dateOfBirth) {
        setName(name);
        setPosition(position);
        setSalary(salary);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return name.equals(employee.name)
                && position.equals(employee.position)
                && Double.compare(salary, employee.salary) == 0
                && dateOfBirth.equals(employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, salary, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", salary=" + getSalary() +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                '}';
    }
}