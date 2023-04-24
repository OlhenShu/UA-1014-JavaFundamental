package lesson3.homework;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        int[] numbers = new int [3];
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<4; i++ ) {
            System.out.println("Enter the " + i + " number: ");
            numbers [i-1] = scanner.nextInt();
        }
        Sort sort = new Sort();
        System.out.println("The smallest number is " + sort.findSmallest(numbers));

    }
}
class Sort {
    int findSmallest (int[] a) {
        for (int i=0; i<a.length-1; i++) {
            if (a[i]>a[i+1]) {
                int small=a[i];
                a[i]=a[i+1];
                a[i+1]=small;
                }
        }
        return a[0];
    }
}
