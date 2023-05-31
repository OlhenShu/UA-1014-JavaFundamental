package lesson13.practical;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("Alf");
        list.add("Bob");
        list.add("Claire");
        list.add("Dilan");
        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(list);
    }
}
