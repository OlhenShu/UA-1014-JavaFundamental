package com.softserve.edu08.practicalTask;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department(
                "Roga ta kopyta",
                new Department.Address(
                        "Lviv",
                        "Chervonoyi Kalyny",
                        1)
        );
        Department department1 = department.clone();
        System.out.println("department = " + department);
        System.out.println("department1 = " + department1);
        department1.getAddress().setCity("Kyiv");
        System.out.println("department = " + department);
        System.out.println("department1 = " + department1);
    }
}
