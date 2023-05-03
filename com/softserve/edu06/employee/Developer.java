package com.softserve.edu06.employee;

public class Developer extends Employee {
    private final String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, Salary: %.2f."
                , getName(), getAge(), getPosition(), getSalary());
    }
}
