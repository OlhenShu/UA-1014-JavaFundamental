package com.softserve.lesson04;

import java.util.Scanner;

public class Lesson04Homework04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Faculty faculty = new Faculty(Season.SPRING);
        faculty.setNumberStudent(scanner.nextInt());
        System.out.println(faculty.getNumberStudent()+" "+faculty.getSeason());
    }
}

class Faculty {
    private int numberStudent;
    private Season season;

    public Faculty(Season season) {
        this.season = season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setNumberStudent(int numberStudent) {
        this.numberStudent = numberStudent;
    }

    public Season getSeason() {
        return season;
    }

    public int getNumberStudent() {
        return numberStudent;
    }
}

enum Season {
    WINTER, SPRING, SUMMER, AUTUMN
}

