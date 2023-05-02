package homework5;

import java.util.Scanner;
                          /**find the second positive number*/
public class Task1B {
    public static void main(String[] args){

        int[] arr = { -3, 80, -5, -2, 5, -7, 9, -15, 13 };
        int count=0;
        int n;
        for (int i = 0; i < arr.length; i++) {
           // System.out.println(arr[i]);
            if (arr[i] > 0) {
                count++;
                if (count == 2) {
                    n = arr[i];
                    System.out.println(n);
                }
            }
        }
    }

}

