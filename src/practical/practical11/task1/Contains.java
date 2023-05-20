package practical.practical11.task1;

import java.util.Scanner;

public class Contains {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter the fragment and text you want to check:");
        String fragment = sc.nextLine();
        String allText = sc.nextLine();
        if (allText.toLowerCase().contains(fragment.toLowerCase())){
            System.out.println("Your fragment is in the text.");
        }
        else {
            System.out.println("Your fragment is not in the text.");
        }
    }
}
