package homework.homework05.task4;

import java.util.Scanner;

public class Random {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 11);
        System.out.println("Try to guess the number? (from 1 to 10)");
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
        System.out.println("Yes! Correct number is " + randomNum + ".");
    }
}
