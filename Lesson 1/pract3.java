package com.lesson1;

import java.util.Scanner;

public class pract3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer for a:");
        Integer a = sc.nextInt();
        System.out.println("Enter integer for b:");
        Integer b = sc.nextInt();
        System.out.println((a+b) + "\n" + (a-b) + "\n" + (a *b) + "\n" + (a/b));
    }
}
