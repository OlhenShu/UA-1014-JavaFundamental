package homework.homework13.task1;

import java.util.Scanner;

public class EncryptDecrypt {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        try {
            System.out.print("Enter some word: ");
            String word = sc.nextLine();
            System.out.print("Enter some integer number: ");
            int someInt = sc.nextInt();
            String newWord = encrypt(word, someInt);
            System.out.printf("Encrypted word: %s. %n",newWord);
            System.out.printf("Decoded word: %s.", decrypt(newWord, someInt));
        }catch (Throwable t){
            System.out.println("Something went wrong.");
        }

    }
    private static String encrypt(String s, int n){
        String newString = "";
        for (int i = 0; i<s.length(); i++){
            char letter = s.charAt(i);
            int nAscii = (int)letter;
            char newLetter = (char)(nAscii + n);
            newString = newString + newLetter;
        }
        return newString;
    }
    private static String decrypt(String s, int n){
        return encrypt(s,-n);
    }
}
