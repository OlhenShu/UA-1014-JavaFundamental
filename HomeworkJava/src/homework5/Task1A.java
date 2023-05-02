package homework5;
  /** integers numbers and calculates the sum of the first five elements if they are
  positive, or the product of the last five elements if they are not and output the result.*/
import java.util.Scanner;

public class Task1A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numbers = {2, 2, -2, 2, -2, 2, 2, -2, -2, -2};// sum 6, prod -8
//        int[] numbers = {-2, -2, -2, -2, -2, 2, 2, 2, 2, 2};// sum 0, prod 1
        System.out.println(numbers[2]);
        int i = 0;
        int sum = 0;
        for (; i < 5; i++) {

            if (numbers[i] > 0){
                sum += numbers[i];
            }
        }
        System.out.println("Sum " +sum);

        int product = 1;

        for (; i < 10; i++) {

            if (numbers[i] < 0){
                product *= numbers[i];
            }
        }
        System.out.println("Product " +product);
        sc.close();
    }
}
