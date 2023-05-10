package com.softserve.edu08;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student[] students = {
                new Student(new Person.FullName("Oleksandr", "Shevchenko"), 23, 3),
                new Student(new Person.FullName("Ben", "Chill"), 21, 1),
        };

        for (Student student : students) {
            System.out.println(student.info());
            System.out.println(student.activity());
        }

        Student newStudent = students[0].clone();
        newStudent.setCourse(2);

        System.out.println(newStudent.info());
        System.out.println(newStudent.activity());
    }
}
