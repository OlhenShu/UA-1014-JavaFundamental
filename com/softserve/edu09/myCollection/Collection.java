package com.softserve.edu09.myCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Collection {
    private final List<Integer> myCollection;

    public Collection() {
        myCollection = new ArrayList<>();
    }

    public void fillWithRandomIntegers(int n) {
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            myCollection.add(random.nextInt(100));
        }
    }

    public void swapMinMax() {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(minIndex)) {
                minIndex = i;
            }
            if (myCollection.get(i) > myCollection.get(maxIndex)) {
                maxIndex = i;
            }
        }

        if (minIndex != maxIndex) {
            int temp = myCollection.get(minIndex);
            myCollection.set(minIndex, myCollection.get(maxIndex));
            myCollection.set(maxIndex, temp);
        }
    }

    public void insertThreeDigitNumberBeforeNegative() {
        Random random = new Random();
        int threeDigitNumber = random.nextInt(900);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, threeDigitNumber);
                break;
            }
        }
    }

    public void insertZeroBetweenDifferentSigns() {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            int current = myCollection.get(i);
            int next = myCollection.get(i + 1);
            if ((current < 0 && next > 0) || (current > 0 && next < 0)) {
                myCollection.add(i + 1, 0);
                i++; // skip zero in the next operation
            }
        }
    }

    public List<Integer> copyFirstKElements(int k) {
        return new ArrayList<>(myCollection.subList(0, k));
    }

    public List<Integer> copyRemainingElementsInReverseOrder(int k) {
        List<Integer> reversed = new ArrayList<>();

        for (int i = myCollection.size() - 1; i >= k; i--) {
            reversed.add(myCollection.get(i));
        }

        return reversed;
    }

    public void removeLastEvenElement() {
        boolean hasEven = false;

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                hasEven = true;
                break;
            }
        }

        if (!hasEven) {
            System.out.println("myCollection does not have an even number.");
        }
    }

    public void removeElementFollowingFirstMinimum() {
        int firstMinIndex = 0;

        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(firstMinIndex)) {
                firstMinIndex = i;
            }
        }

        if (firstMinIndex < myCollection.size() - 1) {
            myCollection.remove(firstMinIndex + 1);
        }
    }

    public void printCollection() {
        System.out.println(myCollection);
    }
}
