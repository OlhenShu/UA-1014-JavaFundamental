package homework.homework05.task1;

import java.util.Scanner;
public class SumOrProduct {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Please, enter the 10 integer numbers: ");

        for(int i=0; i<=9; i++){
            numbers[i] = sc.nextInt();
        }

        if (checForPositive( 5, numbers)){
            int sumOfNumbers = 0;
            for(int i=0; i<=4; i++){
                sumOfNumbers = sumOfNumbers + numbers[i];
            }
            System.out.println("Sum of the first five elements is " + sumOfNumbers + ".");
        }
        else {
            int productOfNumbers = 0;
            int i=5;
            for(; i<=9; i++){
                if (i == 5){productOfNumbers = numbers[i];}
                else {productOfNumbers = productOfNumbers * numbers[i];}
            }
            System.out.println("Product of the last five elements is " + productOfNumbers + ".");
        }

        sc.close();

    }
    public static boolean checForPositive(int i, int[] numbers){
        for(; i>=0; i--){
            if (numbers[i] < 0){
                return false;
            }
        }
        return true;
    }

}
