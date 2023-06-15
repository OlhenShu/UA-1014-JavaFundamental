import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num[] = new double[3];
        System.out.println("Enter the first number:");
        num[0] = scan.nextDouble();
        System.out.println("Enter the second number:");
        num[1] = scan.nextDouble();
        System.out.println("Enter the third number:");
        num[2] = scan.nextDouble();
        scan.close();
        int numberOfNumbers = 0;
        for (var i = 0;i < num.length;i++){
            if (num[i] <= 5 && num[i] >= -5){
                numberOfNumbers++;
            }
        }
        System.out.printf("The number of numbers that belong to the range is %d",numberOfNumbers);
    }
}
