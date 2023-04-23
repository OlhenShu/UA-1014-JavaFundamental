package homework.homework01.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the radius:");
        int r = scanner.nextInt();

        double s = Math.PI * (Math.pow(r, 2));
        double c = 2 * Math.PI * r;

        System.out.println("Perimeter = " + c);
        System.out.println("Area = " + s);
    }
}