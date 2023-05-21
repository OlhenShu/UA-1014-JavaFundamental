package lesson10.homework;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        System.out.println("set1" + set1);

        Set<String> set2 = new HashSet<>();
        set2.add("B");
        set2.add("C");
        set2.add("D");
        System.out.println("set2" + set2);

        Set<String> unionResult = union(set1, set2);
        System.out.println("Union: " + unionResult);

        Set<String> intersectResult = intersect(set1, set2);
        System.out.println("Intersection: " + intersectResult);
    }

    private static <String> Set union(Set<String> set1, Set<String> set2) {
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    private static <String> Set intersect (Set<String> set1, Set<String> set2) {
        Set<String> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }

}
