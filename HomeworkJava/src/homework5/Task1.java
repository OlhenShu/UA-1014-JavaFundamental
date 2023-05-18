package homework5;

import java.util.Scanner;

public class Task1 {
   static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){

      System.out.println("Enter month number:");
      int i = Integer.parseInt(sc.nextLine())-1;

      int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;

          if (i > 0 && i <= 12){
              System.out.println("day in this month " + monthDays[i]);
         }
          else {
              System.out.println(" ");// і що це значить?
              //я як користувач не зрозумію чого пусто
          }
      }
//    public static void main(String[] args) {
//        System.out.print("Enter the month number: ");
//        int month = scanner.nextInt();
//
//        if (month < 1 || month > 12) {
//            System.out.println("Invalid month number!");
//        } else {
//            int[] daysInEachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//            int days = daysInEachMonth[month - 1];
//            System.out.println("Number of days in month " + month + ": " + days);
//        }
//    }
}
