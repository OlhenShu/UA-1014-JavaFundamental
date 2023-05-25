package com.softserve.lesson10;

import java.util.*;

public class Lesson10Homework03 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student;
        int countStudent = 5;
        int numbCourse = 1;
        String numbName = "Orest";

        Scanner scanner = new Scanner(System.in);
        String name;
        int cours;

        for (int i = 0; i < countStudent; i++) {
            System.out.print("Input name: ");
            name = scanner.next();
            System.out.print("Input course: ");
            cours = scanner.nextInt();

            student = new Student(name, cours);
            students.add(student);
        }
        System.out.println(students);

        Student.printStudents(students, numbCourse);
        Student.printStudents(students, numbName);

        Collections.sort(students);
        System.out.println(students);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
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

    public boolean equalsName(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    public boolean equalsCours(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(List<Student> list, int numbCourse) {
        System.out.println("Names of the students from the list who are enrolled in the specified course");
        Student stud = new Student();
        stud.setCourse(numbCourse);
        Student student;

        Iterator<Student> iterator = list.iterator();

        while (iterator.hasNext()) {
            student = iterator.next();
            if (student.equalsCours(stud)) {
                System.out.println(student);
            }
        }
    }

    public static void printStudents(List<Student> list, String numbName) {
        System.out.println("Course of the students from the list who are enrolled in the specified name");
        Student stud = new Student();
        stud.setName(numbName);
        Student student;

        Iterator<Student> iterator = list.iterator();

        while (iterator.hasNext()) {
            student = iterator.next();
            if (student.equalsName(stud)) {
                System.out.println(student);
            }
        }
    }

    @Override
    public int compareTo(Student o) {
        if (this.name.compareTo(o.name) != 0) {
            return this.name.compareTo(o.name);
        } else {
            return Integer.compare(this.course, o.course);
        }
    }
}
