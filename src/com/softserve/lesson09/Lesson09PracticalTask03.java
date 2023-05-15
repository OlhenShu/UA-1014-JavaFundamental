package com.softserve.lesson09;

import java.util.*;

public class Lesson09PracticalTask03 {
    public static void main(String[] args) {
        Random random = new Random();
        Collection<Integer> myCollection = new ArrayList<>();
        int count = 10;

        for (int i = 0; i < count; i++) {
            myCollection.add(random.nextInt(50));
        }

        List<Integer> newCollection = new ArrayList<>();
        Iterator<Integer> iterator = myCollection.iterator();
        int i = 0;

        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element > 25) {
                newCollection.add(i);
            }
            i++;
        }

        System.out.println(myCollection);
        System.out.println(newCollection);

        List<Integer> list = new ArrayList<>();
        list.addAll(myCollection);
        list.add(2, 1);
        list.add(8, -3);
        list.add(5, -4);
        myCollection.clear();
        myCollection.addAll(list);

        Iterator<Integer> iterator1 = myCollection.iterator();
        i = 0;
        while (iterator1.hasNext()) {
            Integer element = iterator1.next();
            System.out.println("position – " + i + ", value of element – " + element);
            i++;
        }

        Iterator<Integer> iterator2 = myCollection.iterator();
        while (iterator2.hasNext()) {
            Integer element = iterator2.next();
            if (element > 20) {
                iterator2.remove();
            }
        }
        System.out.println(myCollection);

        list.clear();
        list.addAll(myCollection);
        list.sort(Integer::compareTo);

        myCollection.clear();
        myCollection.addAll(list);
        System.out.println(myCollection);
    }
}
