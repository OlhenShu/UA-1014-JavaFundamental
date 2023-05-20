package homework.homework10.task1;

import java.util.*;

public class UnionAndIntersect {
    public static void main(String[] args){
        Set<Integer> numbers1 = new HashSet<>();
        Set<Integer> numbers2 = new HashSet<>();
        addNumbers(numbers1, 5);
        addNumbers(numbers2, 6);
        System.out.println("set1: " + numbers1);
        System.out.println("set2: " + numbers2);

        Set<Integer> unionSet = union(numbers1, numbers2);
        System.out.println("unionSet: " + unionSet);

        if (intersect(numbers1, numbers2) == null) {
            System.out.println("Set do not intersection.");
        }else{
            System.out.println("intersectSet: " + intersect(numbers1, numbers2));
        }
    }

    public static Set<Integer> union (Set set1, Set set2){
        Set<Integer>  set = new HashSet<>(set1);
        for (Object number: set2){
            set.add((Integer) number);
        }
        return set;
    }

    public static Set<Integer> intersect (Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set = new HashSet<>(set1);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            var n = iterator.next();
            if (!(set2.contains(n))) {
                iterator.remove();
            }
        }
        if (set.size() > 0) {
            return set;
        }else {
            return null;
        }
    }

    public static Set addNumbers(Set<Integer> numbers, int size){
        for (int i = 0; i < size; i++){
            numbers.add((int)(Math.random() * 11));
        }
        return numbers;
    }
}
