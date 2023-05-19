package homework.lesson10;
import java.util.*;
public class Task10_1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        input(set1,4);
        System.out.println("First Set:\n" + set1);
        input(set2,5);
        System.out.println("Second Set:\n" + set2);
        Set<Integer> unionSet = union(set1,set2);
        System.out.println("Union Set:\n" + unionSet);
        Set<Integer> intersectSet = intersect(set1,set2);
        System.out.println("Intersect Set:\n" + intersectSet);
    }
    public static Set<Integer> union(Set<Integer>set1,Set<Integer>set2){
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
    public static Set<Integer> intersect(Set<Integer>set1, Set<Integer>set2){
        Set<Integer> intersectSet = new TreeSet<>();
        for(var x : set1){
            if(set2.contains(x)){
                intersectSet.add(x);
            }
        }
        return intersectSet;
    }
    public static void input(Set<Integer> set,int length){
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i < length;i++){
            System.out.println("Input " + "number " + (i + 1) + ":");
            int num = scan.nextInt();
            set.add(num);
        }
    }
}

