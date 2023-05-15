package com.softserve.lesson09;

import java.util.ArrayList;
import java.util.Random;

public class Lesson09Homework02 {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        int countStudent = 20;
        int course = 2;

        for (int i = 0; i < countStudent; i++) {
            Student student = new Student();
            student.input();
            studentArrayList.add(student);
        }

        System.out.println(studentArrayList);

        for (int i = countStudent - 1; i >= 0; i--) {
            if (studentArrayList.get(i).getCourse() != course || studentArrayList.get(i).getAverage() < 3) {
                studentArrayList.remove(i);
            }
        }

        System.out.println(studentArrayList);

        printStudents(studentArrayList, course);
    }

    static void printStudents(ArrayList<Student> studentList, int course) {
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).setCourse(course + 1);
        }
        System.out.println(studentList);
    }
}

class Student {
    private String name;
    private int group;
    private int course;

    private int gradesMath;
    private int gradesLang;
    private int gradesPhys;
    private double average;

    public Student() {
    }

    public Student(String name, int group, int course, int gradesMath, int gradesLang, int gradesPhys) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradesMath = gradesMath;
        this.gradesLang = gradesLang;
        this.gradesPhys = gradesPhys;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void input() {
        Random random = new Random();
        char tmp = (char) (random.nextInt(25) + 65);
        name = "" + tmp;

        for (int i = 0; i < 5; i++) {
            tmp = (char) (random.nextInt(25) + 97);
            name += tmp;
        }

        group = random.nextInt(100) + 100;
        course = random.nextInt(5) + 1;

        gradesMath = random.nextInt(5) + 1;
        gradesLang = random.nextInt(5) + 1;
        gradesPhys = random.nextInt(5) + 1;
        average = (gradesMath + gradesLang + gradesPhys) / 3.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", average=" + average +
                '}';
    }
}