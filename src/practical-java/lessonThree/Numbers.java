package lessonThree;
import java.util.Scanner;

public class Numbers { 
    public static void main(String[] args) {

        Numbers testObj = new Numbers();
        int numbA = getNumber("Enter the first number: " );
        int numbB = getNumber("Enter the second number: " );
        testObj.getTotal(numbA, numbB); 
        testObj.getAverage(numbA, numbB);
    } 

    static int getNumber(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public int getTotal(int numbA, int numbB) {
        int sum = numbA + numbB;
        System.out.println("The sum of " + numbA + " and " + numbB + " is " + sum);
        return sum;
    }
    
    public double getAverage(int numbA, int numbB) {
        double average = (numbA + numbB) / 2.0;
        System.out.println("The average of " + numbA + " and " + numbB + " is " + average);
        return average;
    }
}
