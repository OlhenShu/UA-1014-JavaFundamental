package homeworks.homeworkNine.myCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class MyCollection {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        List<Integer> myCollection = new ArrayList<>();

        int num = 10;
        for (int i = 0; i < num; i++) {
            myCollection.add(random.nextInt(50) - 25);
        }

        System.out.println(myCollection);
        System.out.println();

        swap(myCollection);
        System.out.println("Swap min and max elements: " + myCollection);
        System.out.println();

        randomThreeDigitNumber(myCollection, random);
        System.out.println("Adding random three-digit number: " +myCollection);
        System.out.println();

        insertZero(myCollection);
        System.out.println("Insert zero between all neighboring elements: " + myCollection);
        System.out.println();

        int k = inputValue(scanner);

        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        Collections.sort(list1);
        System.out.println("\nFirst 'k' elements sorted: " + list1);
        System.out.println();

        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.sort(list2);
        Collections.reverse(list2);
        System.out.println("Rest of elements sorted reverse: " + list2);
        System.out.println();

        deleteLastEvenNumber(myCollection);
        System.out.println();

        deleteNextAfterMinimum(myCollection);
    }

    public static void swap(List<Integer> collection) {
        int max = 0;
        int maxIndex = 0;
        int min = collection.get(0);
        int minIndex = 0;
        for (int i = 0; i < collection.size(); i++) {
            if (max < collection.get(i)) {
                max = collection.get(i);
                maxIndex = i;
            }
            if (min > collection.get(i)) {
                min = collection.get(i);
                minIndex = i;
            }
        }
        collection.set(minIndex, max);
        collection.set(maxIndex, min);
    }

    public static void randomThreeDigitNumber(List<Integer> collection, Random random) {
        int firstNegativeIndex = 0;

        for (int i = 0; i < collection.size(); i++) {
            int number = collection.get(i);
            if (number < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        collection.add(firstNegativeIndex, random.nextInt(900) + 100);
    }

    public static void insertZero(List<Integer> collection) {
        int i = 0;
        while (i < collection.size() - 1) {
            if (collection.get(i) > 0 && collection.get(i + 1) < 0) {
                collection.add(i + 1, 0);
            }
            if (collection.get(i) < 0 && collection.get(i + 1) > 0) {
                collection.add(i + 1, 0);
            }
            i++;
        }
    }

    public static int inputValue(Scanner scanner) {
        System.out.print("Enter an integer value 5-10 for 'k': ");
        int resilt = scanner.nextInt();
        while (resilt < 5 || resilt > 10) {
            System.out.println("Out of range. Expected 5-10");
            System.out.print("Enter: ");
            resilt = scanner.nextInt();
        }
        return resilt;
    }

    public static void deleteLastEvenNumber(List<Integer> collection) {
        int evenNumber = 0;
        int index = collection.get(0);
        for (int i = collection.size() - 1; i >= 0; i--) {
            if (collection.get(i) != 0 && collection.get(i) % 2 == 0) {
                index = i;
                evenNumber = collection.get(i);
                break;
            }
        }
        if (evenNumber != 0) {
            collection.remove(index);
            System.out.println("Remove last even number: " + collection);
        } else System.out.println("There is no even numbers");
    }

    public static void deleteNextAfterMinimum(List<Integer> collection) {
        int min = collection.get(0);
        int indexOfMin = 0;
        int count = 0;
        for (var el : collection) {
            if (el < min) {
                min = el;
                indexOfMin = count;
            };
            count++;
        }
        if (indexOfMin != collection.size() - 1) {
            collection.remove(indexOfMin + 1);
            System.out.println("Remove next after minimum element: " + collection);
        }
    }
}
