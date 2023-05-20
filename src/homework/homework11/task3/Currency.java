package homework.homework11.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter some text with numbers: ");

        String text = sc.nextLine();
        String pattern = "[0-9]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        StringBuffer correctText = new StringBuffer();
        while (m.find()) {
                String num = text.substring(m.start(), m.end());
                String correctNum = format(num);
                correctText.append(correctNum);
        }
        System.out.println(correctText);
    }

    public static String format(String num){
        if (num.length() > 2) {
            int s = (num.length() - 2);
            return String.format("$%s.%s ", num.substring(0, s), num.substring(s));
        }
        else{
            return String.format("$%d.%s ", 0, num);
        }
    }
}
