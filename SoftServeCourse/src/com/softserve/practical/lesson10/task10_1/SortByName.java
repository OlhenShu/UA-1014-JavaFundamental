package practical.lesson10.task10_1;

import java.util.Comparator;
import java.util.Map;

public class SortByName implements Comparator<Map.Entry<Integer,Employee>> {
    @Override
    public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
        String name1 = o1.getValue().getName();
        String name2 = o2.getValue().getName();
        return name1.compareTo(name2);
    }
}
