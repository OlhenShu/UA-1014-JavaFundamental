
package homework.homework03.task2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Small {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int a = getNumber(scanner,"Input the first number: ");
        int b = getNumber(scanner,"Input the second number: ");
        int c = getNumber(scanner,"Input the third number: ");

        System.out.println("The smallest number is "+ getSmall(a, b, c));
    }
    static int getNumber(Scanner scanner,String prompt){
        System.out.print( prompt);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.nextLine();
            return getNumber(scanner, prompt);
        }
    }
    static int getSmall(int a, int b, int c){
        if (a < b && a < c){
            return a;
        }
        if (b < a && b < c){
            return b;
        }
        else {
            return c;
        }
    }
}
//public class TheSmallestNumber {
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args){
//        int a = getNumber("Input the first integer number: ");
//        int b = getNumber("Input the second integer number: ");
//        int c = getNumber("Input the third integer number: ");
//        System.out.println("The smallest number is "+ getSmall(a, b, c));
//    }
//    static int getNumber(String prompt){
//        System.out.print( prompt);
//        return scanner.nextInt();
//    }
//    static int getSmall(int a, int b, int c){
//        if (a < b && a < c){
//            return a;
//        }
//        else if  (b < a && b < c){
//            return b;
//        }
//        else {
//            return c;
//        }
//    }
//}