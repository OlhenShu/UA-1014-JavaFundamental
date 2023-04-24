package homework.homework04.task1;

import java.util.Scanner;

public class Range0401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float first_num = getNumber(sc,"Please enter a floating point number: ");
        float second_num = getNumber(sc,"Please enter the next floating point number: ");
        float third_num = getNumber(sc,"Please enter another next floating point number: ");
        sc.close();

        if (checkRange(first_num) && checkRange(second_num) && checkRange(third_num)){
            System.out.println("All the numbers you enter are in the range [-5:5].");
        } else {
            System.out.println("You entered a number out of range [-5:5].");
        }

    }
    static float getNumber(Scanner sc,String prompt) {
        System.out.print(prompt);
        return sc.nextFloat();
    }
    static boolean checkRange(float num){
        return (num >= -5 && num <= 5);
    }
}
