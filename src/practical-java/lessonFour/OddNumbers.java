package lessonFour;
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumb = scanner.nextInt();
        System.out.print("\nEnter the second number: ");
        int secondNumb = scanner.nextInt();
        System.out.print("\nEnter the third number: ");
        int thirdtNumb = scanner.nextInt();
        int oddNumbers = countOddNumbers(firstNumb, thirdtNumb, secondNumb);
        System.out.println("You have entered " + oddNumbers + " odd number(s)");
        scanner.close();
    }

    public static int countOddNumbers(int a, int b, int c) {
        int count = 0;
        if (a % 2 != 0) count++;
        if (b % 2 != 0) count++;
        if (c % 2 != 0) count++;
        return count;
    }
}