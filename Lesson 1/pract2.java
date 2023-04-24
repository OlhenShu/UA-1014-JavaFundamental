package com.lesson1;

import java.util.Scanner;

public class pract2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st numb:");
        Double n1 = sc.nextDouble();
        System.out.println("Enter 2nd numb:");
        Double n2 = sc.nextDouble();
        System.out.println("Enter 3rd numb:");
        Double n3 = sc.nextDouble();
        System.out.println((n1 + n2 + n3)/3);
    }
}
