package com.softserve.lesson13;

public class Lesson13Homework03 {
    public static void main(String[] args) {
        int year = 2400;
        System.out.println(leapYear(year));
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}