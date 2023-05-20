package homeworks.homeworkOne;
import java.util.Scanner;
import java.lang.Math;

public class CallCost {
    public static void main(String[] args) {
        callCost();
    }

    public static void callCost() {
        
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Please enter the call price to Germany:");
        double c1 = scann.nextDouble();
        System.out.println("Please enter the duration of call in minutes");
        double d1 = scann.nextDouble();
        System.out.println("Please enter the call price to Ukraine:");
        double c2 = scann.nextDouble();
        System.out.println("Please enter the duration of call in minutes");
        double d2 = scann.nextDouble();
        System.out.println("Please enter the call price to Spain:");
        double c3 = scann.nextDouble();
        System.out.println("Please enter the duration of call in minutes");
        double d3 = scann.nextDouble();
        
        double costGermany = Math.round((c1 * d1) * 100.0) / 100.0;
        double costUkraine = Math.round((c2 * d2) * 100.0) / 100.0;
        double costSpain = Math.round((c3 * d3) * 100.0) / 100.0;
        double totalMinutes = d1 + d2 + d3;
        double totalCost = costGermany + costSpain + costUkraine;

        System.out.println("The call to Germany with duration of " + d1 + " minutes costs $" + costGermany);
        System.out.println("The call to Ukraine with duration of " + d2 + " minutes costs $" + costUkraine);
        System.out.println("The call to Spain with duration of " + d3 + " minutes costs $" + costSpain);
        System.out.println("The total cost for " + totalMinutes + " minutes is: $" + totalCost);
        scann.close();
    }
}
