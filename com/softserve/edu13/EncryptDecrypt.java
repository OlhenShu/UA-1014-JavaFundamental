package com.softserve.edu13;

import java.util.Scanner;

/**
 * Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
 * Method encrypt should take a string and return coded string where every letter is moved
 * on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
 * return decoded value
 */
public class EncryptDecrypt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int offset = 3;
        String encrypted = encrypt(str, offset);

        System.out.printf("Encrypted string \"%s\": %s%n",
                str, encrypt(str, offset));
        System.out.printf("Decrypted string \"%s\": %s%n",
                encrypted, decrypt(encrypted, offset));

        input.close();
    }

    public static String encrypt(String s, int n) {
        try {
            return crypt("encrypt", s, n);
        } catch (Exception e) {
            System.out.println("Encryption failed: " + e.getMessage());
            return "";
        }
    }

    public static String decrypt(String s, int n) {
        try {
            return crypt("decrypt", s, n);
        } catch (Exception e) {
            System.out.println("Decryption failed: " + e.getMessage());
            return "";
        }
    }

    private static String crypt(String method, String s, int n) {
        StringBuilder encrypted = new StringBuilder();
        char offset;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (method.equalsIgnoreCase("encrypt")) {
                    offset = (char) ((c - 'a' + n) % 26 + 'a');
                } else {
                    offset = (char) ((c - 'a' - n) % 26 + 'a');
                }

                encrypted.append(offset);
            } else {
                encrypted.append(c);
            }
        }

        return encrypted.toString();

    }
}
