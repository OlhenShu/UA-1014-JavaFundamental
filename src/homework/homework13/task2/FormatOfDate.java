package homework.homework13.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class FormatOfDate {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter some date: ");
        String date = sc.nextLine();
        if (check(date)){
            System.out.println("Your date format is correct.");

        }else {
            System.out.println("Your date format is incorrect.");
        }

    }
    public static Boolean check(String text){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate date = LocalDate.parse(text, formatter);
            return true;
        }catch (DateTimeParseException e){
            return false;
        }
    }
}
