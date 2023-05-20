package homework.homework11.task4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreetingMessage {
    static Scanner sc = new Scanner(System.in);
    static String[] gr = {"Hello", "Hewe a good day", "Glad to see you", "Hi"};

    public static void main(String[] args) {
        System.out.println("Enter your first and last name: ");
        String name = sc.nextLine();
        while (check(name)){
            System.out.println("You have entered extra characters. Will you try again? (yes/no)");
            String answer = sc.nextLine();
            if (answer.toLowerCase().equals("yes")){
                System.out.println("Enter your first and last name: ");
                name = sc.nextLine();
            }else { break;}
        }
        if(!check(name)){
            greet(name);
        }
    }
    public static Boolean check(String text){
        String pattern = "[^a-zA-Z- ]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        return m.find();
    }
    public static void greet(String name){
        int i = (int) (Math.random() * gr.length);
        System.out.printf("%s, %s.",gr[i], name);
    }
}
