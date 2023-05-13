package practical.practical09.task2;

import java.sql.SQLOutput;
import java.util.*;

public class Clear {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String num = getLineNumber(sc, "Enter a list of numbers separated by commas: ");
        String[] split = num.split(", ");
        List<String> numbersList = new ArrayList<>();
        for (String s: split) {
            numbersList.add(s);
        }
        System.out.println("Yor list: " + numbersList);
        removeNumber(numbersList);
        System.out.println(numbersList);


    }
    public static void removeNumber(List<String> numbersList){
        var it = numbersList.iterator();
        while (it.hasNext()){
            var el = it.next();
            if (!(numbersList.indexOf(el) == numbersList.lastIndexOf(el))){
                it.remove();
            }
        }
    }
    static String getLineNumber(Scanner scanner, String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
