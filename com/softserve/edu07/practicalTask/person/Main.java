package com.softserve.edu07.practicalTask.person;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Student("Oleksandr"),
                new Cleaner("Izabella"),
                new Cleaner("Daniel"),
                new Teacher("Olha"),
                new Teacher("Elena"),
        };

        for (Person person : persons) {
            person.print();

            if (person instanceof Staff) {
                System.out.printf("Salary: %.2f%n", ((Staff) person).salary());
            }
        }
    }
}
