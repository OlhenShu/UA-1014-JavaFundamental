package com.lesson3;

import java.util.Scanner;

public class pract1 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = getNumber(sc, "First value:");
        double b = getNumber(sc, "Second value:");
        double sum = getTotal(a, b);
        double avg = getAverage(a, b);
        System.out.println("Your sum:" + sum);
        System.out.println("Your average:" + avg);
    }

    public static double getTotal(double a, double b){
        double total = a + b;
        return total;
    }
    public static double getAverage(double a, double b){
        double average = (a + b)/2;
        return average;
    }
    public static double getNumber(Scanner sc, String prompt){
        System.out.println(prompt);
        return sc.nextDouble();


    }


}