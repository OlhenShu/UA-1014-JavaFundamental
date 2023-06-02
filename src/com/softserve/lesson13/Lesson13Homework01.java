package com.softserve.lesson13;

import java.util.function.Function;

public class Lesson13Homework01 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);

        String strEncrypt = encrypt(str, 3);
        System.out.println(strEncrypt);

        String strDecrypt = decrypt(strEncrypt, 3);
        System.out.println(strDecrypt);
    }

    static String encrypt(String s, int n) {
        Function<Character, Character> characterFunction = x -> (char) (x + n);
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = characterFunction.apply(chars[i]);
        }

        String str = new String(chars);
        return str;
    }

    static String decrypt(String s, int n) {
        Function<Character, Character> characterFunction = x -> (char) (x - n);
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = characterFunction.apply(chars[i]);
        }

        String str = new String(chars);
        return str;
    }
}
