package practical.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        String[] names = {"Jim","Ben","Roman","Artur","Andriy","Mary","Merlin"};
        int[] numbers = {12,25,23,67,45,33,24,11};
        Task5_1.sortStringArray(names);
        Task5_1.averageValue(numbers);
        Task5_1.checkValue(numbers);
    }
    public static void sortStringArray(String[] arrays){
        System.out.println("Array before sorting - " + Arrays.toString(arrays));
        Arrays.sort(arrays);
        System.out.println("Array after sorting - " + Arrays.toString(arrays));
    }
    public static void averageValue(int[] numbers){
        int average = 0;
        for (int i = 0;i < numbers.length;i++){
            average += numbers[i];
        }
        System.out.println("Average value of the array " + Arrays.toString(numbers) +
                " is " + (average /= numbers.length) );
    }
    public static void checkValue(int[] arrays){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number(integer)to check in the array:");
        int value = scan.nextInt();
        boolean check = false;
        for (int i = 0;i < arrays.length;i++){
            if (value == arrays[i]) {
                System.out.println("The array has the number - " + value);
                check = true;
            }
        }
        if (check == false){
            System.out.println("The array hasn't the number - " + value);
        }
    }
}
