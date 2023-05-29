package homework13;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class homework13Task4 {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your birth name in format dd.MM.yyyy: ");
            String birthdayStr = scanner.nextLine();

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyy");
            LocalDate birthday = LocalDate.parse(birthdayStr,dateTimeFormatter);

            printDayOfWeek(birthday);
        }catch (Exception t){
            System.out.println("Incorrect date");
        }
    }
     public static void printDayOfWeek(LocalDate birthday){
         System.out.println("Day: " + birthday.getDayOfWeek() + "\n");

         LocalDate  sixMonthsLater = birthday.plusMonths(6);
         System.out.println("Day of the week after 6 months: " + sixMonthsLater.getDayOfWeek());
         System.out.println(sixMonthsLater.getMonth() + "\n");

         LocalDate twelveMonthsLater = birthday.plusMonths(12);
         System.out.println("Day of the week after 12 months: " + twelveMonthsLater.getDayOfWeek());
         System.out.println(twelveMonthsLater.getMonth() + "\n");
     }
}
