import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scan.nextInt();
        System.out.println("Enter the third number:");
        int num3 = scan.nextInt();
        scan.close();
        int maximum = Math.max(Math.max(num1,num2),num3);
        int minimum = Math.min(Math.min(num1,num2),num3);
        System.out.printf("The maximum number is %d%nThe minimum number is %d",maximum,minimum);
    }
}
