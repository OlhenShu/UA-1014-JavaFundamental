package homework.homework01.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the radius:");
        try {
            int r = scanner.nextInt();

            double s = Math.PI * (Math.pow(r, 2));
            double c = 2 * Math.PI * r;

            System.out.println("Perimeter = " + c);
            System.out.println("Area = " + s);
        }catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter an integer value for the radius.");
        }
    }
}