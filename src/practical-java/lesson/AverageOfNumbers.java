package lesson;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        averageOfNumbers();
    }

    public static void averageOfNumbers() {
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Input first number:");
        int firstNumber = scann.nextInt();
        System.out.println("\nInput second number:");
        int secondNumber = scann.nextInt();
        System.out.println("\nInput third number:");
        int thirdNumber = scann.nextInt();
        
        double result = (double)(firstNumber + secondNumber + thirdNumber) / 3;
        double roundedResult = Math.round(result * 100.0) / 100.0;
        System.out.println("\nAverage is: " + roundedResult);
        scann.close();
    }
}
