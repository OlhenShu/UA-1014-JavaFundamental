package homework5;
  /** integers numbers and calculates the sum of the first five elements if they are
  positive, or the product of the last five elements if they are not and output the result.*/
import java.util.Scanner;

public class Task1A {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
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

    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = new int[10];
//
//        System.out.println("Enter 10 integer numbers:");
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Number " + (i + 1) + ": ");
//            numbers[i] = scanner.nextInt();
//        }
//
//        int result;
//        if (areFirstFivePositive(numbers)) {
//            result = calculateSumOfFirstFive(numbers);
//            System.out.println("Sum of the first five positive elements: " + result);
//        } else {
//            result = calculateProductOfLastFive(numbers);
//            System.out.println("Product of the last five non-positive elements: " + result);
//        }
//    }
//
//    private static boolean areFirstFivePositive(int[] numbers) {
//        for (int i = 0; i < 5; i++) {
//            if (numbers[i] <= 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static int calculateSumOfFirstFive(int[] numbers) {
//        int sum = 0;
//        for (int i = 0; i < 5; i++) {
//            sum += numbers[i];
//        }
//        return sum;
//    }
//
//    private static int calculateProductOfLastFive(int[] numbers) {
//        int product = 1;
//        for (int i = 5; i < 10; i++) {
//            product *= numbers[i];
//        }
//        return product;
//    }
}
