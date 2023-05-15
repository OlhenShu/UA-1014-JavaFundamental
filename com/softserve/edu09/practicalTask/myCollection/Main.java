package com.softserve.edu09.practicalTask.myCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        int n = 10;

        for (int i = 0; i < n; i++) {
            myCollection.add(random.nextInt(50));
        }

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }

        System.out.println("myCollection: " + myCollection);
        System.out.println("newCollection: " + newCollection);

        myCollection.removeIf(el -> el > 20);
        System.out.println("myCollection after removing elements greater than 20: " + myCollection);
        System.out.println("size: " + myCollection.size());

        int collectionSize = myCollection.size();

        if (collectionSize >= 2) {
            myCollection.add(2, 1);
        }
        if (collectionSize >= 8) {
            myCollection.add(8, -3);
        }
        if (collectionSize >= 5) {
            myCollection.add(5, -4);
        }

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.printf("position - %d, value of element - %d%n", i, myCollection.get(i));
        }

        myCollection.sort(Integer::compareTo);
        System.out.println("myCollection after sorting: " + myCollection);
    }
}
