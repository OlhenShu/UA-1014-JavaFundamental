package com.softserve.lesson03;

import java.util.Scanner;

public class Lesson03Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbStudent = 3;
        Student[] students = new Student[numbStudent];

        for (int i = 0; i < numbStudent; i++) {
            students[i] = new Student();
            System.out.print("Input name Student" + students[i].getNumb() + ": ");
            students[i].setName(scanner.next());
            System.out.print("Input rating Student" + students[i].getNumb() + ": ");
            students[i].setRating(scanner.nextDouble());
        }

        for (int i = 0; i < numbStudent; i++) {
            System.out.println(students[i]);
        }

        System.out.print("Total rating = " + Student.getRatingAll() + "\nAverage rating = " + Student.avgRating());
    }
}

class Student {
    private String name;
    private double rating;

    private int numb = 0;
    private static double ratingAll = 0;
    private static int count = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRating(double rating) {
        this.rating = rating;
        ratingAll += rating;
    }

    public double getRating() {
        return rating;
    }

    public static double getRatingAll() {
        return ratingAll;
    }

    public int getNumb() {
        return numb;
    }

    public static double avgRating() {
        return ratingAll / count;
    }

    Student() {
        count++;
        numb = count;
    }

    Student(String name) {
        this.name = name;
        count++;
        numb = count;
    }

    boolean betterStudent(Student s) {
        if (this.rating > s.rating) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student" + numb + ": name = " + name + " rating = " + rating;
    }
}
