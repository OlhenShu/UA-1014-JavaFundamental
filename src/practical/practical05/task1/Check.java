package practical.practical05.task1;
import java.util.Scanner;
public class Check {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the integer value: ");
        int value = scan.nextInt();
        if (check(value)){
            System.out.println("Correct. Right value is " + value + ".");
        }
        else {
            System.out.println("Oh no! Your value is incorrect.");
        }
        scan.close();
    }
    public static boolean check(int value){
        for (int num: Average.numbers){
            if (num == value){
                return true;
            }
        }
        return false;
    }
}
