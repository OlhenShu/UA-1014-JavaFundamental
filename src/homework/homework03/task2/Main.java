
package homework.homework03.task2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a = getNumber("Input the first number:");
        int b = getNumber("Input the second number:");
        int c = getNumber("Input the third number:");

        System.out.println("The smallest number is "+ getSmall(a, b, c));
    }
    static int getNumber(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print( prompt);
        return scanner.nextInt();
    }
    static int getSmall(int a, int b, int c){
        if (a < b && a < c){
            return a;
        }
        if (b < a && b < c){
            return b;
        }
        if (c < a && c < b){
            return c;
        }
        else {
            return a;
        }
    }
}