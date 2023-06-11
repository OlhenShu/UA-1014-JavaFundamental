package homework.homework05.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Random {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int randomNum = (int)(Math.random() * 11);
        int answer = getNumber("Try to guess the number? (from 1 to 10)", randomNum);
        System.out.println("Yes! Correct number is " + answer + ".");
    }
    static int getNumber(String prompt, int randomNum){
        System.out.println( prompt);
        try {
            int answer = sc.nextInt();
            while (answer != randomNum){
                if (answer > randomNum){
                    System.out.println("Too high, try again.");
                    answer = sc.nextInt();
                }
                else{
                    System.out.println("Too low, try again.");
                    answer = sc.nextInt();
                }
            }
            return answer;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.nextLine();
            return getNumber(prompt,randomNum);
        }
    }
}
