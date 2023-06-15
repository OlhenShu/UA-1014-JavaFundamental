package homework.lesson11;
import java.util.Scanner;
import java.util.regex.*;
public class Task11_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder formatText = deleteMoreSpaces(str);
        System.out.println("Text after format - " + formatText);
    }
    static StringBuilder deleteMoreSpaces(String str){
        Pattern p = Pattern.compile("(\\s+)");
        Matcher m = p.matcher(str);
        StringBuilder build = new StringBuilder();
        System.out.println("Text before format - " + str);
        while (m.find()){
            m.appendReplacement(build," ");
        }
        m.appendTail(build);
        return build;
    }
}
