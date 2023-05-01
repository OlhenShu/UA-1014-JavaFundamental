package lesson5.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 1; i <= arr.length; i++) {
            System.out.print("Enter " + i + " number: ");
            arr[i - 1] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
                temp = i;
            }
            if (count == 2) {
                break;
            }

        }
        System.out.println("The second positive number found at " + temp + "th position");

        int min = arr[0];
        int minposition = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minposition = i;
            }
        }
        System.out.println("Minimum number is " + min + " at " + minposition + " position");
   int product =1;
        for (int x : arr) {
       if (x%2==0 && x!=0) {
           product*=x;
       }
   }
        System.out.println("Product of even numbers is " + product);
        scanner.close();
    }

}