package homework.lesson11;

import java.util.*;
import java.util.regex.*;

public class Task11_4 {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
            public static void main(String[] args){
                Pattern p = Pattern.compile("[A-z\\s\\']+");
                boolean check = true;
                do{
                    System.out.println("Input your first name and last name,use only English letters, spaces, and hyphens");
                    String name = scan.nextLine();
                    Matcher m = p.matcher(name);
                    if(m.matches()){
                        print(name,random);
                        check = false;
                    }
                    else{
                        System.out.println("Incorrect input,try again");
                    }
                }while(check);
            }
            static void print(String name,Random ran){
                int num = ran.nextInt(5);
                switch (num) {
                    case 0 -> System.out.println("Hello " + name);
                    case 1 -> System.out.println("Welcome to the club " + name);
                    case 2 -> System.out.println("Hi " + name);
                    case 3 -> System.out.println("Now you us member " + name);
                    default -> System.out.println("Nice to meet you " + name);
                }
            }
}
