package homework.lesson5.task5_1.months;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Month[] months = {
                new Month("January",31,1),
                new Month("February",28,2),
                new Month("March",31,3),
                new Month("April",30,4),
                new Month("May",31,5),
                new Month("June",30,6),
                new Month("July",31,7),
                new Month("August",31,8),
                new Month("September",30,9),
                new Month("October",31,10),
                new Month("November",30,11),
                new Month("December",31,12),
        };
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the month number (1-12),January is first:");
        int monthIndex = scan.nextInt();
        for(int i = 0;i < months.length;i++){
            if (monthIndex  == months[i].getMonthIndex()){
                System.out.println(months[i].toString());
                break;
            } else if (monthIndex < 1 || monthIndex > 12) {
                System.out.println("Incorrect month number");
                break;
            }
        }
        scan.close();
        }
    }

