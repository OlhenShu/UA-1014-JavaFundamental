package practical.practical05.task1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        String[] arr = {"Sweet dreams are made of this", "Who am I to disagree", "Travel the world and the seven seas",
                "Everybody's looking for something"};

        /*for (String word : arr){
            String[] parts = word.split(" ",2);

            System.out.println(parts[0]);
            String[] letter = parts[0].split("(?!^)");
            System.out.println(letter[0]);
            for(String letter : word.length()){
                System.out.println(letter);
            }
        }*/
        //System.out.println(arr[0]);
        sortString(arr);
    }
    public static String[] sortString(String[] arr){
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                String[] parts = arr[i].split(" ",2);
                System.out.println(parts[0]);
                //System.out.println(arr[j]);
                /*if (int (arr[i][0].) < arr[j][0]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }*/
            }
        }
        return arr;
    }
}
