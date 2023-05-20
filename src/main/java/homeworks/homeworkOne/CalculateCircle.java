package homeworks.homeworkOne;
import java.util.Scanner;
import java.lang.Math;

public class CalculateCircle {
    public static void main(String[] args) {
        areaAndPerimeterOfCircle();
    }

    public static void areaAndPerimeterOfCircle() {

        Scanner scann = new Scanner(System.in);
        
        System.out.println("Please enter the radius:");
        double radius = scann.nextDouble();
        double perimeterResult = Math.round((2 * Math.PI * radius) * 100.0) / 100.0;
        double areaResult = Math.round((Math.PI * radius * radius) * 100.0) / 100.0;
        System.out.println("\nThe perimeter of circle equals: " + perimeterResult);
        System.out.println("\nThe area of circle equals: " + areaResult);
        scann.close();
    }
}
