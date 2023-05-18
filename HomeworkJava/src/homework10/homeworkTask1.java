package homework10;

import java.util.HashSet;
import java.util.Set;
import static homework10.Task1SetOperations.union;
import static homework10.Task1SetOperations.intersect;
public class homeworkTask1 {
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(1);
        set1.add(8);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(8);

        union(set1,set2);
        System.out.println(union(set1,set2));
        intersect(set1,set2);
        System.out.println(intersect(set1,set2));
    }

}



