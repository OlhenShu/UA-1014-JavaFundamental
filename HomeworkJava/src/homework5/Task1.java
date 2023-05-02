package homework5;

import java.util.Scanner;

public class Task1 {

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter month number:");
      int i = Integer.parseInt(sc.nextLine())-1;

      int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;

          if (i > 0 && i <= 12){
              System.out.println("day in this month " + monthDays[i]);
         }
          else {
              System.out.println(" ");
          }
      }
}
