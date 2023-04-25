package homeworkThree;
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int numbOne = scanner.nextInt();
        System.out.print("\nInput the first number: ");
        int numbTwo = scanner.nextInt();
        System.out.print("\nInput the first number: ");
        int numbThree = scanner.nextInt();
        int smallestNumb = findSmallestNumber(numbOne, numbTwo, numbThree);
        System.out.print("\nThe smallest number is " + smallestNumb);
    }
    public static int findSmallestNumber(int numbOne, int numbTwo, int numbThree) {
        int smallestNumb = 0;
        if (numbOne < numbTwo) smallestNumb = numbOne;
        if (numbTwo < numbThree) smallestNumb = numbTwo;
        if (numbThree < numbTwo) smallestNumb = numbThree;
        return smallestNumb;


    }
}
