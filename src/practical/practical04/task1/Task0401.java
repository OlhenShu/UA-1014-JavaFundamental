package practical.practical04.task1;

import java.util.Scanner;

public class Task0401 {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_num = getNumber(sc,"Please enter an integer: ");
        int second_num = getNumber(sc,"Please enter the next integer: ");
        int third_num = getNumber(sc,"Please enter another next integer: ");
        sc.close();

        amountOfEvenNumbers(first_num);
        amountOfEvenNumbers(second_num);
        amountOfEvenNumbers(third_num);
        System.out.println("You entered " + count + " even numbers.");

    }
    static int getNumber(Scanner sc,String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }
    static boolean checkingForEvenNumber(int num){
        return (num % 2) == 0;
    }

    static int amountOfEvenNumbers(int num){
        if (checkingForEvenNumber(num)){
            count++;
        }
        return count;
    }
}


