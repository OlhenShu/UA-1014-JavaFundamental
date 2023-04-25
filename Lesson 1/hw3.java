package com.lesson1;

import java.util.Scanner;

public class hw3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cost of the 1st call:");
        Double c1 = sc.nextDouble();
        System.out.println("Duration of the 1st call (minutes):");
        Double t1 = sc.nextDouble();

        System.out.println("Cost of the 2nd call:");
        Double c2 = sc.nextDouble();
        System.out.println("Duration of the 2nd call (minutes):");
        Double t2 = sc.nextDouble();

        System.out.println("Cost of the 3rd call:");
        Double c3 = sc.nextDouble();
        System.out.println("Duration of the 3rd call (minutes):");
        Double t3 = sc.nextDouble();
        Double cll1 = (c1*t1);
        Double cll2 = (c2*t2);
        Double cll3 = (c3*t3);
        System.out.println("First call costs:" + cll1);
        System.out.println("Second call costs:" + cll2);
        System.out.println("Third call costs:" + cll3);
        System.out.println("Total price for all 3 calls: " + (cll3 +cll2 +cll1));

    }

}