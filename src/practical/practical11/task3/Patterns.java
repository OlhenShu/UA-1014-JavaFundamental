package practical.practical11.task3;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Patterns {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter some text fragment: ");

        for (int i = 0; i < 5; i++){
            String text = sc.nextLine();
            if(check(text)){
                System.out.println("Meets the condition");
            }
            else {
                System.out.println("Does not meet the condition");
            }
        }
    }
    public static Boolean check(String text){
        return Pattern.matches("\\w{3,15}", text);
    }
}
