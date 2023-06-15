package practical.lesson5;
import java.util.Scanner;
public class Task5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = 0;
        int flag = 0;
        System.out.println("Enter a positive number(integer) to check:");
        int n = scan.nextInt();
        scan.close();
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }
    }
}
