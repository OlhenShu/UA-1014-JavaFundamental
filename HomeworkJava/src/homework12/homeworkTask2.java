package homework12;
import java.util.Scanner;

public class homeworkTask2 {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        try {
            int[] numbers = new int[10];
            for(int i = 0; i < 10; i++){
                numbers[i] = readNumber(start, end);
                start = numbers[i] + 1;
            }
            for (Integer number : numbers ){
                System.out.println(number);
            }
        }
        catch (NumberFormatException e) {
            System.err.println("Invalid range");
        }catch (Exception e){
            System.err.println("Invalid characters");
        }
    }
    public static int readNumber(int start , int end)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
            int num = sc.nextInt();
            if(num < start || num > end){
                throw new NumberFormatException();
            }
        return num;
    }
}
