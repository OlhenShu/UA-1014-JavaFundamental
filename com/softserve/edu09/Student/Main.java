package com.softserve.edu09.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Oleksandr", "Group 1", 1, List.of(5, 4, 3, 4, 5)));
        students.add(new Student("Mikhail", "Group 1", 1, List.of(3, 4, 2, 3, 4)));
        students.add(new Student("Denis", "Group 2", 2, List.of(2, 2, 1, 1, 4)));
        students.add(new Student("Hanna", "Group 2", 2, List.of(5, 5, 4, 5, 5)));

        // all students
        System.out.println("All students:");
        Student.printAllStudents(students);

        // remove underperforming students and promote others to next course
        Student.removeUnderperformingStudents(students);

        // print all students after removing underperformers and promoting others
        System.out.printf("%nAfter removing underperformers and promoting others:%n");
        Student.printAllStudents(students);

        // print students enrolled in course 2
        Student.printStudents(students, 2);
    }
}
