package homework.homework12.task1;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dividing {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Input two float numbers: ");

        try {
            double first = sc.nextDouble();
            double second = sc.nextDouble();
            double d = div(first,second);
            System.out.printf("Result of dividing = %.2f", d);
        }catch (NullPointerException e){
            e.getMessage();
        }catch (InputMismatchException e){
            System.out.println("Invalid number type.");
        }catch (Exception e){
            System.out.println("Something went wrong.");
        }

    }
    public static double div(double first, double second){
        return  first/second;
    }
}
