package homework.lesson5;

import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[2];
        boolean check = false;
        do{
            for(int i = 0;i < numbers.length;i++){
                System.out.printf("Enter the number %d: ",i + 1);
                numbers[i] = scan.nextInt();
            }
            System.out.println("The sum = " + (numbers[0] + numbers[1]));
            System.out.println("Want to try more?(yes or no):");
            scan.nextLine();
            String desire = scan.nextLine().toLowerCase();
            if(desire.equals("no")){
                check = true;
                System.out.println("Good Luck!");
            }
        }while(check == false);
    }
}
