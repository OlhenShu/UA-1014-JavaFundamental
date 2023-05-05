package com.softserve.lesson01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson01PracticalTask04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How are you?");

        String answer = br.readLine();
        System.out.println("You are " + answer);
    }
}
