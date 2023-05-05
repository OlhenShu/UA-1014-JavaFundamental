package homework.lesson5.task5_1.secondint;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[]numbers = new int[5];
        input(numbers);
        System.out.println(Arrays.toString(numbers));
        positionOfSecondPositiveNumber(numbers);
        minimumValueAndItsPosition(numbers);
        productOfEvenNumbers(numbers);
    }
    public static void input(int[] num){
        Scanner scan = new Scanner(System.in);
        for (var i = 0;i < num.length;i++){
            System.out.printf("Input number %d%n",i + 1);
            num[i] = scan.nextInt();
        }
    }
    public static void positionOfSecondPositiveNumber(int[] num){
        int count = 0;
        for(var i = 0;i < num.length;i++){
            if (num[i] > 0){
                count++;
            }
            if (count == 2){
                System.out.println("Position of the second positive number is " + i);
            }
        }
    }
    public static void minimumValueAndItsPosition(int[] num){
        Arrays.sort(num);
        System.out.println("Minimum value is " + num[0] + " and its position is 0");
    }
    public static void productOfEvenNumbers(int[] num){
        int product = 1;
        for(var i = 0;i < num.length;i++){
            if(num[i] % 2 == 0 && num[i] != 0){
                product *= num[i];
            }
        }
        System.out.println("Product is " + product);
    }
}
