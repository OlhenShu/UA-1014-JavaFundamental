package com.softserve.edu10.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Jann", 1));
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 1));
        students.add(new Student("Oleksandr", 3));
        students.add(new Student("David", 2));

        System.out.println("Students sorted by name:");
        Student.sortByName(students);
        Student.printStudents(students);

        System.out.println("Students sorted by course:");
        Student.sortByCourse(students);
        Student.printStudents(students);

        System.out.println("Enter the course whose students you want to show?");
        Scanner input = new Scanner(System.in);
        int courseToPrint = input.nextInt();

        System.out.printf("Students from the course %d:%n", courseToPrint);
        Student.printStudents(students, courseToPrint);
    }
}
