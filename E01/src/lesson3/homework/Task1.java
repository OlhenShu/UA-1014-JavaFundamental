package lesson3.homework;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Side 1 :");
        double Side1 = scanner.nextDouble();
        System.out.println("Enter Side 2 :");
        double Side2 = scanner.nextDouble();
        System.out.println("Enter Side 3 :");
        double Side3 = scanner.nextDouble();
        Area a = new Area ();
        System.out.println("The area of a triangle is: " + a.area(Side1, Side2, Side3));

    }
}

class Area {
    double area (double a, double b, double c) {
        double p = ((a + b + c) / 2);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

