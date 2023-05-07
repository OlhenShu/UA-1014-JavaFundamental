package practical.practical05.task2;
import practical.practical05.task1.Average;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the positive integer value: ");
        int value = scan.nextInt();
        if (isPrime(value)){
            System.out.println(value + " is prime number.");
        }
        else {
            System.out.println(value + " is not prime number.");
        }
        scan.close();
    }
    public static boolean isPrime(int num){
        if (num <= 3){
            return (num > 1);
        }
        if (((num % 3) == 0) || ((num % 2) == 0)){
            return false;
        }
        else{
            for (int i = 5; (i * i) <= num; i += 6) {
                if ((num % i) == 0 || (num % (i + 2)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
