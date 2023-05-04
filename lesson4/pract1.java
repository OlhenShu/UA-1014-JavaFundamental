package com.lesson4;

import java.util.Scanner;

//        1. Input three numbers from console. Find out and output result how many of them are
//        odd.
//        2. Input from the console the number of the day of the week. Output the name in two
//        languages. via switch(i)
//        3. Input from the console the name of the country. Output the name of the continent.
//        (Declare enum with names of continents).
public class pract1 {

    private static int counter = 0;

    public static int odd(double number) {
        if((number % 2) == 0){
            System.out.println("Number [" + (int) number + "] is odd");
            counter++;
        }else{System.out.println("Number [" + (int) number + "] is not odd");}
        System.out.println("Quantity of odd numbers: "+ counter);
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double numb1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double numb2 = sc.nextDouble();
        System.out.println("Enter third number:");
        double numb3 = sc.nextDouble();
        odd(numb1);
        odd(numb2);
        odd(numb3);




    }

}

