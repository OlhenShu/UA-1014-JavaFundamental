package practical.lesson10.task10_1;

import java.util.*;

public class SortByID implements Comparator<Map.Entry<Integer,Employee>> {
    @Override
    public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
        int key1 = o1.getKey();
        int key2 = o2.getKey();
        return Integer.compare(key1,key2);
    }
}
