package homework11;
import java.util.Scanner;

public class homeworkTask2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String rStr = str.replaceAll("\\s+" , " ");
        System.out.println(rStr);
    }
}
