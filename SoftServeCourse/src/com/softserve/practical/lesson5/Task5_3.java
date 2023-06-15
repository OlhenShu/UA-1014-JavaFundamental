package practical.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Task5_3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers = fillTheArray(numbers);
        Arrays.sort(numbers);
        System.out.println("The biggest number in the array is " + numbers[9]);
        sumOfPositiveNumbers(numbers);
        positiveOrNegative(numbers);
    }
    public static int[] fillTheArray(int [] num){
        Random random = new Random();
        for (int i = 0;i < num.length;i++){
            num[i] = random.nextInt(-100,100);
        }
        System.out.println("Created array - " + Arrays.toString(num));
        return num;
    }
    public static void sumOfPositiveNumbers(int[] num){
        int sum = 0;
        for (int i = 0;i < num.length;i++){
            if (num[i] > 0){
                sum += num[i];
            }
        }
        System.out.println("Sum of positive integer equals " + sum);
    }
    public static void positiveOrNegative(int [] num){
        int positive = 0;
        int negative = 0;
        for (int i = 0;i < num.length;i++){
            if (num[i] > 0){
                positive++;
            }
            else if (num[i] < 0) {
                negative++;
            }
        }
        System.out.println("Count of the negative numbers is " + negative);
        if (positive > negative){
            System.out.println("There are more positive values in the array");
        }
        else if (negative > positive){
            System.out.println("There are more negative values in the array");
        }
        else{
            System.out.println("There are an equal number of positive and negative values in the array");
        }
    }
}

