package homework13;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class homework13Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Format mm.dd.yy");
        String date = scanner.nextLine();
        validateDate(date);
    }
    static String validateDate(String date){
        String pattern = "(0[1-9]|1[0-2])\\.(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\.(0[1-9]|1[1-9]|2[1-4])";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(date);
        while (m.find()) {
            String match = m.group();
            System.out.println(match);
        }
        return date;
    }
}
