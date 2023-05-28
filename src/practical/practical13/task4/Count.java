package practical.practical13.task4;

import java.util.List;
import java.util.function.Predicate;

public class Count {
    public static void main(String[] args){
        List<Integer> listInteger = List.of(15, 88, 12, -47, 507, 36, 112, 8, 11, 61);
        System.out.println(count(listInteger, i -> i > 20));
    }
    static int count(List<Integer> listInteger, Predicate<Integer> condition){
        int res = 0;
        for (var el : listInteger){
            if(condition.test(el)){
                res++;
            }
        }
        return res;
    }
}
