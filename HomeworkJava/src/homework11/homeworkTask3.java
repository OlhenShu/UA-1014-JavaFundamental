package homework11;
import java.util.regex.*;
import java.util.Scanner;
public class homeworkTask3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        String pattern = "\\$\\d+\\.\\d+";
        String text = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            String match = m.group();
            System.out.println("Found match: " + match);
        }
    }
}
