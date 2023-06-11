package homework.homework04.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Range0401 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        float first_num = getNumber("Please enter a floating point number: ");
        float second_num = getNumber("Please enter the next floating point number: ");
        float third_num = getNumber("Please enter another next floating point number: ");
        //sc.close();

        if (checkRange(first_num) && checkRange(second_num) && checkRange(third_num)){
            System.out.println("All the numbers you enter are in the range [-5:5].");
        } else {
            System.out.println("You entered a number out of range [-5:5].");
        }

    }
    static float getNumber(String prompt) {
        System.out.print(prompt);
        try {
            return sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a floating point number.");
            sc.nextLine();
            return getNumber(prompt);
        }
    }
    static boolean checkRange(float num){
        return (num >= -5 && num <= 5);
    }
}
