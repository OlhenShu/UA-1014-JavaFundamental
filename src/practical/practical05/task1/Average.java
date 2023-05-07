package practical.practical05.task1;

import java.util.Arrays;

public class Average {
    public static int[] numbers = {5, 48, 39, 6, 8};
    public static void main(String[] args){
        System.out.println("Average of this array " + Arrays.toString(numbers) + " is " + getAverage(numbers) + ".");
    }
    public static float getAverage(int[] numbers){
        int sum = 0;
        for (int num:numbers){
            sum = sum + num;
        }
        return ((float) sum /numbers.length);
    }
}
