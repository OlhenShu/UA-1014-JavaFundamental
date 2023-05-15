package com.softserve.edu09.myCollection;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection collection = new Collection();
        int n = 10;
        int k = 5;

        // Declare collection myCollection of 10 integers and fill it (from the console or random).
        collection.fillWithRandomIntegers(n);
        collection.printCollection();

        // Swap the maximum and minimum elements in the list.
        collection.swapMinMax();
        collection.printCollection();

        // Insert a random three-digit number before the first negative element of the list
        collection.insertThreeDigitNumberBeforeNegative();
        collection.printCollection();

        // Insert a zero between all neighboring elements collection myCollection with different signs
        collection.insertZeroBetweenDifferentSigns();
        collection.printCollection();

        // Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
        //list2 in reverse order.
        List<Integer> list1 = collection.copyFirstKElements(k);
        List<Integer> list2 = collection.copyRemainingElementsInReverseOrder(k);
        System.out.printf("List1: %s%nList2: %s%n", list1, list2);

        // In a list myCollection remove the last even element (if there are even elements in the list). If
        //there is no such element, display a message.
        collection.removeLastEvenElement();
        collection.printCollection();

        // Remove from the list myCollection the element following the first minimum. If the minimum
        //element is the last one, nothing needs to be removed.
        collection.removeElementFollowingFirstMinimum();
        collection.printCollection();
    }
}
