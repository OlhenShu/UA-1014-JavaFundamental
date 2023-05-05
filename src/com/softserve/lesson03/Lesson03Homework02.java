package com.softserve.lesson03;

import java.util.Scanner;

public class Lesson03Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numb numb = new Numb();

        System.out.print("Input the first number: ");
        numb.setNumber1(scanner.nextInt());
        System.out.print("Input the second number: ");
        numb.setNumber2(scanner.nextInt());
        System.out.print("Input the third number: ");
        numb.setNumber3(scanner.nextInt());

        System.out.println("The smallest number is " + numb.findNumb());
    }
}

class Numb {
    private int number1;
    private int number2;
    private int number3;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public double getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    public int findNumb() {
        return Math.min(Math.min(number1, number2), number3);
    }
}
