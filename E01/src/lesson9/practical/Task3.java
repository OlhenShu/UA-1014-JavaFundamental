package lesson9.practical;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(50));
        }

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 25) {
                newCollection.add(i);
            }
        }
        System.out.println("The initial collection");
        System.out.println(myCollection);
        System.out.println("The position of elements > 25");
        System.out.println(newCollection);

        var it = myCollection.iterator();
        while (it.hasNext()) {
            var el = it.next();
            if (el > 20) {
                it.remove();
            }
        }
        System.out.println("The  collection without numbers > 20");
        System.out.println(myCollection);
        if (myCollection.size() >= 7) {
            myCollection.add(2, 1);
            myCollection.add(8, -3);
            myCollection.add(5, -4);
            System.out.println("The  collection with some new numbers");
            System.out.println(myCollection);
        }
        Collections.sort(myCollection);
        System.out.println("Sorted collections" + myCollection);

    }
}
