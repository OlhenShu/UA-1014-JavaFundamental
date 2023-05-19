package edu05;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {2, -5, 7, -4, 8};
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)+ " ");
    }
}

