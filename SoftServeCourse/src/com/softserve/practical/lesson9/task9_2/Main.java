package practical.lesson9.task9_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String number = "1,2,3,4,4,5,6,6,7,8";
        String[] numbers = number.split(",");
        List<String> list = new ArrayList<>();
        for(int i = 0;i < numbers.length;i++){
            if (list.contains(numbers[i])){
                System.out.println("Number " + numbers[i] + " is contains");
            }
            else{
                list.add(numbers[i]);
            }
        }
        System.out.println(list);
    }
}
