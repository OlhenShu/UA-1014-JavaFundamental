package homeworks.homeworkNine.myCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class MyCollection {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();

        int num = 10;
        for (int i = 0; i < num; i++) {
            myCollection.add(random.nextInt(50) - 25);
        }

        System.out.println(myCollection);
        System.out.println();

        swap(myCollection);
        System.out.println(myCollection);
        System.out.println();

        randomThreeDigitNumber(myCollection, random);
        System.out.println(myCollection);
        System.out.println();

        insertZero(myCollection);
        System.out.println(myCollection);
        System.out.println();

        int k = myCollection.size();

        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        Collections.sort(list1);
        System.out.println(list1);
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
}
