package homeworkThree;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double sideOne = scanner.nextDouble();
        System.out.print("\nInput the second number: ");
        double sideTwo = scanner.nextDouble();
        System.out.print("\nInput the third number: ");
        double sideThree = scanner.nextDouble();
        System.out.println("\nThe area of the triangle is " + calcTriangleArea(sideOne, sideTwo, sideThree));
    }
    

    public static double calcTriangleArea(double sideOne, double sideTwo, double sideThree) {
        double semiPerimeter = (sideOne + sideTwo + sideThree) / 2.0;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter * sideThree));
        return Math.round(area * 100.0) / 100.0;
    }
}