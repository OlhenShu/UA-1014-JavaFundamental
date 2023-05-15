package com.softserve.edu09.practicalTask.removeDuplicates;

public class Main {
    public static void main(String[] args) {
        String input = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates(input);

        removeDuplicates.showUniqueElements();
    }
}