package lessonOne;
import java.util.Scanner;
import java.lang.Math;;

public class CalculateInput {
    public static void main(String[] args) {
        calculateInput();
    }

    public static void calculateInput() {

        Scanner scann = new Scanner(System.in);
        
        System.out.println("Please enter first number:");
        int a = scann.nextInt();
        System.out.println("Please enter second number:");
        int b = scann.nextInt();
        double aDivB = (double)a / b;
        double divResult = Math.round(aDivB * 100.0) / 100.0;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + divResult);
        scann.close();
    }
}
