import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[3];
        int odd = 0;
        int even = 0;
        System.out.println("Enter the first number:");
        num [0] = scan.nextInt();
        System.out.println("Enter the second number:");
        num [1] = scan.nextInt();
        System.out.println("Enter the third number:");
        num [2] = scan.nextInt();
        scan.close();
        for (int i = 0;i < num.length;i++){
            if (num[i] % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.printf("%d number(s) is odd%n%d number(s) is even",odd,even);
    }
}
