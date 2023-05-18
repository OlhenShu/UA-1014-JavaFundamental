package homework10;
import java.util.HashSet;
import java.util.Set;


public  class Task1SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }
    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set1);
        return intersect;
    }
}
