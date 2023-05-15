package homework5;

import java.util.Scanner;

public class Task2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int a;
        int b;
        int c;
        do {
            System.out.println("Input ");
            a = sc.nextInt();
            b = sc.nextInt();
            int sum = a + b;
            System.out.println(sum);
            System.out.println("Сontinue program press number 1 , Stop program 2 ");

            c = sc.nextInt();

        }while (c < 2);
    }
//    public static void main(String[] args) {
//        int sum;
//        char repeat;
//
//        do {
//            System.out.print("Enter the first number: ");
//            int num1 = scanner.nextInt();
//
//            System.out.print("Enter the second number: ");
//            int num2 = scanner.nextInt();
//
//            sum = num1 + num2;
//            System.out.println("Sum: " + sum);
//
//            System.out.print("Do you want to perform the operation again? (Y/N): ");
//            repeat = scanner.next().charAt(0);
//        } while (repeat == 'Y' || repeat == 'y');
//    }
}
