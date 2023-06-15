package homework.lesson5;

import java.util.Random;
import java.util.Scanner;

public class Task5_4 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Random game!Try to guess the number(1-100).");
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int randomNumber = random.nextInt(100) + 1;
        do{
            System.out.println("What number fell out?");
            int inputNumber = scan.nextInt();
            if(randomNumber < inputNumber){
                System.out.println("Too high, try again.");
            }
            else if (inputNumber == randomNumber){
                System.out.println("Congratulations!You win!");
                break;
            }
            else {
                System.out.println("Too low, try again.");
            }
        }while(true);
    }
}
