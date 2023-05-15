package lesson9.homework;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(50) - 25);
        }
        System.out.println("The initial collections" + myCollection);

        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(minIndex)) {
                minIndex = i;
            } else if (myCollection.get(i) > myCollection.get(maxIndex)) {
                maxIndex = i;
            }
        }

        Collections.swap(myCollection, minIndex, maxIndex);
        System.out.println("Collection after swapping: " + myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            int current = myCollection.get(i);
            int next = myCollection.get(i + 1);
            if (current * next < 0) {
                myCollection.add(i + 1, 0);
                i++; // Skip the next element, since we just inserted a zero
            }
        }
        System.out.println("Collection with 0: " + myCollection);

        int k = 3;
        List<Integer> myCollection1 = myCollection.subList(0, k);
        List<Integer> myCollection2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(myCollection2);

        int lastIndex = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastIndex = i;
                break;
            }
        }

        if (lastIndex != -1) {
            myCollection.remove(lastIndex);
        } else {
            System.out.println("There are no even elements in the list.");
        }
    }
}

