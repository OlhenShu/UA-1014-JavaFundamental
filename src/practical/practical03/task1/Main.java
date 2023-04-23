package practical.practical03.task1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int first = getNumber("Enter the first number:");
        int second = getNumber("Enter the second number:");

        System.out.println("The sum of " + first +" and "+ second +" is "+ getTotal(first, second));
        System.out.println("The average of " + first + " and "+ second + " is "+ getAverage(first, second));
    }
    static int getNumber(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }
    static int getTotal(int f, int s){
        return f+s;
    }
    static double getAverage(double f, double s){
        double a = (f + s) / 2;
        return a;
    }
}
