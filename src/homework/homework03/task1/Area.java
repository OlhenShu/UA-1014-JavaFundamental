
package homework.homework03.task1;

import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = getNumber(scanner,"Input Side 1: ");
        int b = getNumber(scanner,"Input Side 2: ");
        int c = getNumber(scanner,"Input Side 3: ");
        scanner.close();

        System.out.printf("The area of the triangle is %.3f.",getArea(a, b, c));
    }
    static int getNumber(Scanner scanner, String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }
    static double getArea(double a, double b, double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
