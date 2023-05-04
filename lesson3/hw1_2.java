package com.lesson3;


import java.util.Scanner;
import java.lang.Math;

public class hw1_2 {
    public static void main(String[] args) {

        System.out.println(tr_area());
        System.out.println(the_smallest());

    }



    public static double tr_area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second side: ");
        double b = sc.nextDouble();
        System.out.println("Enter the third side: ");
        double c = sc.nextDouble();
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    public static int the_smallest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        int min;
        if(a < b){min = a;}
        else min = b;
        if(c < min){ min = c;}

        return min;
    }
}