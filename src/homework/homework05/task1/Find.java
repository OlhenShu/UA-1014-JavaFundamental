package homework.homework05.task1;

import java.util.Arrays;
import java.util.Scanner;
public class Find {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Please, enter the 5 integer numbers: ");

        for (int i = 0; i <= 4; i++) {
            arr[i] = sc.nextInt();
        }
        int pp = positionPositive(arr);
        if (pp == 0) {
            System.out.println("The second positive number is missing from the list.");
        }
        else {
        System.out.println("Position of second positive number is " + (pp+1) + ".");
        }

        int[] minN = minValue(arr);
        System.out.println("Minimum value is " + minN[0] + ". Position of minimum value is "
                + (minN[1] + 1) + ".");

        System.out.println("Product value is " + productValue(arr) + ".");
        sc.close();
    }

    public static int positionPositive(int[] numbers){
        int positiveNumber = 0;

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0){
                if (positiveNumber == 0){positiveNumber = numbers[i];}
                else{
                    return i;
                }
            }
        }
        return 0;
    }
    public static int[] minValue(int[] numbers){
        int min = numbers[0];
        int iMin = 0;
        for(int i = 0; i < numbers.length; i++){
            if (min > numbers[i]){
                min = numbers[i];
                iMin = i;
            }
        }
        return new int[]{min, iMin};
    }

    public static int productValue(int[] numbers){
        int product = 1;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == 0){
                continue;
            }
            else {
                if (i == 0){product = numbers[i];}
                else {product = product * numbers[i];}

            }
        }
        return product;
    }
}
