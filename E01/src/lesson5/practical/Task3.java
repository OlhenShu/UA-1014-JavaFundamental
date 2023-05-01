package lesson5.practical;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20) - 10;
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum = " + max);

        int sum = 0;
        int countpos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                countpos++;
            }
        }
        System.out.println("The sum of positive numbers " + sum);
        int countneg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                countneg++;
            }
        }
        System.out.println("Numbers of negative numbers is " + countneg);

        if (countneg > countpos) {
            System.out.println("There are more negative values in the array");
        } else if (countpos > countneg) {
            System.out.println("There are more positive values in the array");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }

    }
}
