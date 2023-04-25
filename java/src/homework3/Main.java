package homework3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

        //Triangle
        System.out.println("Input side 1 : ");
        float a = scan.nextFloat();
        System.out.println("Input side 2 : ");
        float b = scan.nextFloat();
        System.out.println ("Input side 3 : ");
        float c = scan.nextFloat();
        float pp = (a + b + c) / 2;
        double s = (pp*(pp - a)*(pp - b)*(pp - c)) * 0.5;
        System.out.println( "the area of the triangle is :" + s);
         //search min number
        System.out.println("Input the first number : ");
        int num1 = scan.nextInt();
        System.out.println("Input the second number : ");
        int num2 = scan.nextInt();
        System.out.println ("Input the third number : ");
        int num3 = scan.nextInt();
        int res = Math.min(num1, Math.min(num2, num3));
       System.out.println("The smallest number is :" + res);




    }
}
