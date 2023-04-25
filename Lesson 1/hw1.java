package com.lesson1;


import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        Double rad = sc.nextDouble();
        Double per = 2 * Math.PI * rad;
        Double area = Math.PI * Math.pow(rad,2);
        System.out.println("The perimeter of the circle with radius(" + rad + ")is: " + per);
        System.out.println("The area of the circle with radius(" + rad + ")is: " + area);
    }
}



