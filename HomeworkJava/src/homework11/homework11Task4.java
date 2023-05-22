package homework11;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework11Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        Matcher m;
        boolean isFirstIteration = true;
        do {
            if(!isFirstIteration){
                System.out.println("The name was entered incorrectly,enter pleas your first name and last name again");
            }
            if(isFirstIteration){
                System.out.println("Enter your first name and last name in English");
            }
            isFirstIteration = false;
            name = scanner.nextLine();

            String pattern = "[a-zA-Z\\s-]+";
            Pattern p = Pattern.compile(pattern);
            m = p.matcher(name);

        }while (!m.matches());

        Random random = new Random();
        String[] strings = {"Hi", "Hallo", "Good afternoon"};
        int index = random.nextInt(strings.length);
        String greeting = strings[index];
        System.out.printf("%s %s", name, greeting);
    }
}
