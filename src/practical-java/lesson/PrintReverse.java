package lesson;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        printReverse();
    }

    public static void printReverse() {
        
        System.out.println("Hello! Please enter 3 strings:\n");
        Scanner scann = new Scanner(System.in);

        String thirdtOutput = scann.nextLine();
        String secondOutput = scann.nextLine();
        String firstOutput = scann.nextLine();

        System.out.println("\nThank you! The output is:");
        System.out.println("\n\t" + firstOutput);
        System.out.println("\n\t" + secondOutput);
        System.out.println("\n\t" + thirdtOutput);
        scann.close();
    }
}