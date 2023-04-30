package homework.homework05.task2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(sumAndAnswer(sc));
        }while(sc.nextLine().toLowerCase().equals("yes"));

        sc.close();
    }
    public static String sumAndAnswer(Scanner sc){
        System.out.print("Please, enter the 2 integer numbers: ");
        System.out.println("Sum of this number is " + (sc.nextInt() + sc.nextInt()) + ".");
        System.out.println("Do you want try again? (yes/no)");
        return sc.nextLine();
    }
}
