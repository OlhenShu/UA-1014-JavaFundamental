package homework5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        do {
            System.out.println("Input ");
            a = sc.nextInt();
            b = sc.nextInt();
            int sum = a + b;
            System.out.println(sum);
            System.out.println("Сontinue program press number 1 , Stop program 2 ");

            c = sc.nextInt();

        }while (c < 2);

    }
}
