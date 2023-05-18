package com.softserve.edu10.student;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

//Create a class named Student that stores information about the student's name and
//course.
//• The class should include properties to access these fields, a constructor with
//parameters, and a method called printStudents that takes a List of students and an
//Integer representing the course number as arguments.
//• This method should print the names of the students from the list who are enrolled in
//the specified course to the console using an iterator.
//• Additionally, add methods to compare students by name and by course.
//• In the main() method, create a List named "students" and add five different Student
//objects to it. Then, display the list of students sorted by name and sorted by course.
public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        setName(name);
        setCourse(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void sortByName(List<Student> students) {
        students.sort(Student.compareByName());
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public static void sortByCourse(List<Student> students) {
        students.sort(Student.compareByCourse());
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();

            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.printf("%s Course: %d", student.getName(), student.getCourse());
        }
    }
}
