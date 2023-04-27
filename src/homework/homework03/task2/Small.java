
package homework.homework03.task2;

import java.util.Scanner;
public class Small {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = getNumber(scanner,"Input the first number: ");
        int b = getNumber(scanner,"Input the second number: ");
        int c = getNumber(scanner,"Input the third number: ");
        scanner.close();

        System.out.println("The smallest number is "+ getSmall(a, b, c));
    }
    static int getNumber(Scanner scanner,String prompt){
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