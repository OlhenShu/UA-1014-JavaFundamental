
package homework.homework03.task1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a = getNumber("Input Side 1:");
        int b = getNumber("Input Side 2:");
        int c = getNumber("Input Side 3:");

        System.out.println("The area of the triangle is "+ getArea(a, b, c));
    }
    static int getNumber(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }
    static double getArea(double a, double b, double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
