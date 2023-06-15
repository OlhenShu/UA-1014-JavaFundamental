package homework.lesson11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11_3 {
    public static void main(String[] args) {
        System.out.println("Enter text:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        searchUSMoneyFormat(text);
    }
    static void searchUSMoneyFormat(String text){
        Pattern p = Pattern.compile("(\\$\\d*\\.\\d{1,2})");
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
