package homework.lesson13;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task13_2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input date,use format(MM.dd.yy):");
        String inputDate = scan.nextLine();
        checkFormat(inputDate);
    }
    public static void checkFormat(String inputDate){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate checkDate = LocalDate.parse(inputDate, format);
            System.out.println("Correct input date");
        }
        catch (DateTimeParseException e){
            System.out.println("Incorrect input date");
        }
    }
}


