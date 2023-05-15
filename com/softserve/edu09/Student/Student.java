package com.softserve.edu09.Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private final String group;
    private int course;
    private final List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public void promoteToNextCourse() {
        this.course++;
    }

    public static void removeUnderperformingStudents(List<Student> students) {
        List<Student> toRemove = new ArrayList<>();

        for (Student student : students) {
            if (student.getAverageGrade() < 3.0) {
                toRemove.add(student);
            } else {
                student.promoteToNextCourse();
            }
        }

        students.removeAll(toRemove);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.printf("%nStudents enrolled in course %d:%n", course);

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void printAllStudents(List<Student> students) {
        for (Student student : students) {
            System.out.printf("%s, %s, Course %d, Grades: %s, Average: %.2f%n",
                    student.getName(), student.getGroup(), student.getCourse(),
                    student.getGrades(), student.getAverageGrade());
        }
    }
}
