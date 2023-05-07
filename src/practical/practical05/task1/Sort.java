package practical.practical05.task1;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String[] arr = {"Sweet dreams are made of this", "Who am I to disagree", "Travel the world and the seven seas",
                "Everybody's looking for something"};

        System.out.println(Arrays.toString(sortString(arr)));
    }

    public static String[] sortString(String[] arr) {
        String tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i].compareTo(arr[j])) > 0) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
