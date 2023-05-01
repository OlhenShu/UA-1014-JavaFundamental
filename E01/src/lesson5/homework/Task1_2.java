package lesson5.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 1; i <= arr.length; i++) {
            System.out.print("Enter " + i + " number: ");
            arr[i - 1] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                continue;
            }
            sum += arr[i];

        }
        System.out.println("Sum = " + sum);
        int product=1;
        for (int i = 5; i < 10; i++) {
            if (arr[i] > 0) {
                continue;
            }
            product *= arr[i];

        }
        System.out.println("Product = " + product);
    }
}
