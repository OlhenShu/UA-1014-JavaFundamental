package homework4;

import java.util.Scanner;

public class Country{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input Country: Ukraine, France, China, USA,India ");
        String country = sc.nextLine();

        String result;
        switch (country){
            case "China","India" ->{
                result = "Asia";
                System.out.println(result);
            }
            case "Ukraine","France" ->{
                result = "Europe";
                System.out.println(result);
            }
            case "USA" ->{
                result = "America";
                System.out.println(result);
            }
        }
    }
}