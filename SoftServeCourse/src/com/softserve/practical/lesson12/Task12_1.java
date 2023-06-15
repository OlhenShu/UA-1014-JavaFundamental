package practical.lesson12;

import java.util.*;


public class Task12_1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.println("Enter size of first side");
        a = input(a);
        System.out.println("Enter size of second side");
        b = input(b);
        int area = squareRectangle(a,b);
        System.out.println("Area = " + area);
    }
    static int squareRectangle(int a,int b){
        if(a < 0 || b < 0){
            throw new ArithmeticException("Area can't be negative");
        }
        return a * b;
    }
    static int input(int num) {
            try {
                num = scan.nextInt();
                return num;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Incorrect input, return 1");
                return 1;
            }
        }
}
