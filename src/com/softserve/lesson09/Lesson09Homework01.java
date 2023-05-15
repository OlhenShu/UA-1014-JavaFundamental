package com.softserve.lesson09;

import java.util.*;

public class Lesson09Homework01 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> myCollection = new ArrayList<>();
        int count = 10;

        for (int i = 0; i < count; i++) {
            myCollection.add(random.nextInt(200) - 100);
        }

        System.out.println(myCollection);
        int min = myCollection.get(0);
        int indexmin = 0;
        int max = myCollection.get(0);
        int indexmax = 0;

        for (int i = 0; i < count; i++) {
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                indexmin = i;
            }
            if (myCollection.get(i) > max) {
                max = myCollection.get(i);
                indexmax = i;
            }
        }

        myCollection.set(indexmin, max);
        myCollection.set(indexmax, min);
        System.out.println(myCollection);

        for (int i = 0; i < count; i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, random.nextInt(899) + 100);
                break;
            }
        }

        System.out.println(myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0) {
                myCollection.add(i + 1, 0);
            }
            if (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
            }
        }

        System.out.println(myCollection);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int k = random.nextInt(myCollection.size() - 1) + 1;

        list1.addAll(myCollection.subList(0, k));
        list2.addAll(myCollection.subList(k, myCollection.size()));

        list1.sort(Integer::compareTo);
        list2.sort(Integer::compareTo);
        Collections.reverse(list2);

        System.out.println(list1);
        System.out.println(list2);

        int tmp = 0;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                tmp = 1;
                break;
            }
        }

        if (tmp == 0) {
            System.out.println("There is no such element");
        }

        System.out.println(myCollection);

        min = myCollection.get(0);
        indexmin = 0;

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                indexmin = i;
            }
        }

        if (indexmin != myCollection.size() - 1) {
            myCollection.remove(indexmin + 1);
        }

        System.out.println(myCollection);
    }
}