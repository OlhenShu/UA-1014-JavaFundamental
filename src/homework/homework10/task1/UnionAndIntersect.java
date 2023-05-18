package homework.homework10.task1;

import java.util.*;

public class UnionAndIntersect {
    public static void main(String[] args){
        Set<Integer> numbers1 = new HashSet<>();
        Set<Integer> numbers2 = new HashSet<>();
        addNumbers(numbers1, 5);
        addNumbers(numbers2, 6);
        System.out.println("set1" + numbers1);
        System.out.println("set2" + numbers2);
        Set<Integer> unionSet = union(numbers1, numbers2);
        System.out.println("set1" + numbers1);
        System.out.println("set2" + numbers2);
        System.out.println("unionSet: " + unionSet);
    }

    public static Set union (Set set1, Set set2){
        Set<Integer>  set = new HashSet<>(set1);
        for (var number: set2){
            set.add((Integer) number);
        }
        return set;
    }

    public static Set intersect (Set set1, Set set2){
        return set1;
    }

    public static Set addNumbers(Set<Integer> numbers, int size){
        for (int i = 0; i < size; i++){
            numbers.add((int)(Math.random() * 51));
        }
        return numbers;
    }
}
