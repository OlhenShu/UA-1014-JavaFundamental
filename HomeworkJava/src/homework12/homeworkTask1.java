package homework12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class homeworkTask1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the number one");
            double n = scanner.nextDouble();
            System.out.println("Enter the number two");
            double m = scanner.nextDouble();
            double result = div(n, m);
            System.out.println(result);
        } catch (InputMismatchException e){
            System.err.println(" Invalid input ");
        }
    }
    public static double div(double n, double m) {
            return n / m;
    }
}
