package homework.homework01.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the cost of calls:");
        double c1 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        double c3 = scanner.nextDouble();
        System.out.println("Enter the duration of the calls:");
        double t1 = scanner.nextDouble();
        double t2 = scanner.nextDouble();
        double t3 = scanner.nextDouble();

        System.out.println("Cost of call 1: " + tc(c1, t1));
        System.out.println("Cost of call 2: " + tc(c2, t2));
        System.out.println("Cost of call 3: " + tc(c3, t3));
        System.out.println("The total cost: " + (tc(c1, t1) + tc(c2, t2) + tc(c3, t3)));
    }
    static double tc(double c, double t) {
        return c * t;
    }
}