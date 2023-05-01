package lesson5.practical;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String[] arr = {"Alf", "Claire", "Etan", "Bob", "Dilan"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {2, 5, 7, 9, 15};
        double sum = 0;
        for (int x : arr2) {
            sum += x;
        }
        System.out.println("The average is " + sum / arr2.length);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the positive number: ");
        int num = scanner.nextInt();
        boolean findnumber = false;
        for (int x : arr2) {
            if (x == num) {
                findnumber = true;
                break;
            }
        }
        if (findnumber) {
            System.out.println("Bingo! The array contains entered number");
        } else System.out.println("Bad for you (( Try again later");
    scanner.close();
    }
}
