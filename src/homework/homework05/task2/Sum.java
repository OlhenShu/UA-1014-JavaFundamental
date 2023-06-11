package homework.homework05.task2;

import java.util.Scanner;

public class Sum {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        try {
            do {
                System.out.print("Please, enter the 2 integer numbers: ");
                System.out.println("Sum of this number is " + (sc.nextInt() + sc.nextInt()) + ".");
                System.out.println("Do you want try again? (yes/no)");
                sc.nextLine();
            } while (sc.nextLine().toLowerCase().equals("yes"));
        }catch (Exception e){
            System.out.println("Something went wrong.");
        }
        //sc.close();
    }
}
