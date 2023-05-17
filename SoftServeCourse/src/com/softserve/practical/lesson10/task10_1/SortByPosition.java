package practical.lesson10.task10_1;
import java.util.*;
public class SortByPosition implements Comparator<Map.Entry<Integer,Employee>> {
    @Override
    public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
        String pos1 = o1.getValue().getPosition();
        String pos2 = o2.getValue().getPosition();
        return pos1.compareTo(pos2);
    }
}
