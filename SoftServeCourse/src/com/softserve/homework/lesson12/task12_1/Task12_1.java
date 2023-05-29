package homework.lesson12.task12_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task12_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        System.out.println("Enter the first double number");
        a = input(a);
        System.out.println("Enter the second double number");
        b = input(b);
        double c = div(a,b);
        System.out.println(c);
    }

    static double div(double a, double b) {
        try {
            if(b == 0){
                throw new DivideByZeroException();
            }
            return a / b;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }
        catch (Exception e){
            System.out.println("Another exception");
            return 0;
        }
    }

    static double input(double num) {
        try {
            num = scanner.nextDouble();
            return num;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Incorrect input, return 1.2");
            return 1;
        }
    }
}
