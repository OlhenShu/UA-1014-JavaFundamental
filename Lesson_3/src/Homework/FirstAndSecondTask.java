package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndSecondTask {
        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            while(true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Choose action:");
                System.out.println("\t1 - Check first home task task ");
                System.out.println("\t2 - Check second home task task");
                System.out.println("\t3 - End work ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        firstHometask(scanner);
                        break;
                    case 2:
                        secondHometask(scanner);
                        break;
                    case 3:
                        sc.close();
                        scanner.close();
                        return;
                    default:
                        System.out.println("Necessary to enter option 1-3\n");
                }
            }
        }
        public static void firstHometask(Scanner scanner){
            double a,b,result;
            System.out.print("Input Side 1:");
            a=scanner.nextDouble();
            System.out.print("Input Side 2:");
            b=scanner.nextDouble();
            result=0.5*a*b;
            System.out.println("the area of the triangle is "+ result);
        }
        public static void secondHometask(Scanner scanner){
            double[] minValue=new double[3];
            System.out.print("Input the first number:");
            minValue[0]=scanner.nextDouble();
            System.out.print("Input the second number:");
            minValue[1]=scanner.nextDouble();
            System.out.print("Input the third number:");
            minValue[2]=scanner.nextDouble();
            Arrays.sort(minValue);
            System.out.println("Min Value = " +minValue[0]);
        }
}
