package practical.lessonNine.myCollection;

import java.util.*;

public class Scratch {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> newCollection = new ArrayList<>();
        Random random = new Random();
        int num = 10;
        for (int i = 0; i < num; i++) {
            myCollection.add(random.nextInt(50));
        }

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 25) {
                newCollection.add(i);
            }
        }

        System.out.println(myCollection.toString());
        System.out.println(newCollection.toString());
        System.out.println();

        var it = myCollection.iterator();
        while (it.hasNext()) {
            var el = it.next();
            if (el > 20) {
                it.remove();
            }
        }

        System.out.println(myCollection.toString());
        System.out.println(newCollection.toString());
        System.out.println();

        // myCollection.add(2, 1);
        // myCollection.add(8, -3);
        // myCollection.add(5, -4);
        // System.out.println(myCollection.toString());
    }
}
