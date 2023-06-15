package homework.lesson5.task5_1.firstint;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        for(var i = 0;i < numbers.length;i++){
            System.out.printf("Input number %d:%n",i + 1);
            numbers[i] = scan.nextInt();
        }
        System.out.println("You have array - " + Arrays.toString(numbers));
        findSumOrProduct(numbers);

    }
    public static void findSumOrProduct(int[] numbers){
        int sum = 0;
        int product = 1;
        int count = 0;
        for(int i = 0;i < numbers.length - 5;i++){
            if(numbers[i] > 0){
                count++;
                }
            }
        if (count == 5){
            for(int i = 0;i < numbers.length - 5;i++){
                sum += numbers[i];
            }
            System.out.println("Sum is " + sum);
        }
        else{
            for(int i = 5;i < numbers.length;i++){
                product *= numbers[i];
            }
            System.out.println("Product is " + product);
        }
    }
}
