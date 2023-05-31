package lesson13.homework;

import java.util.Scanner;

public class Task1 {
    public static String encrypt(String s, int n) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char encryptedChar = (char) (c + n);
            encrypted.append(encryptedChar);
        }
        return encrypted.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, -n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");

        String text = scanner.nextLine();

        String encrypted = encrypt(text, 3);
        System.out.println("Encrypted string: " + encrypted);

        String decrypted = decrypt(encrypted, 3);
        System.out.println("Decrypted string: " + decrypted);
    }
}
