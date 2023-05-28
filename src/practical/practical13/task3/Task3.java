package practical.practical13.task3;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        var fruit = new ArrayList<String>();
        fruit.add("kiwi");
        fruit.add("apple");
        fruit.add("mango");
        fruit.add("banana");
        fruit.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(fruit);
    }
}
