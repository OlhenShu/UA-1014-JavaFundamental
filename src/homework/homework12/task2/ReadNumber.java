package homework.homework12.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter 10 integer numbers: ");
        for(int i = 0; i < 10; i++) {
            try {
                int n = readNumber(1, 100);
                if (!(n == 0)) {
                    System.out.println(n);
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid number type.");
                break;
            }
        }
    }
    public static int readNumber (int start, int end){
        int number = sc.nextInt();
        if ((start < number) && (number < end)){
            return number;
        }else {return 0;}
    }
}
