package homework9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Collection {
    public static void main(String[] args){
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();

        int n =10;
        for (int i = 0; i < n; i++){
            myCollection.add(random.nextInt(8)-2);
        }
//        int min = myCollection.get(0);
//        int max = myCollection.get(0);
//        for (int i = 0; i < myCollection.size(); i++){
//            if (myCollection.get(i) > max){
//                max = myCollection.get(i);
//            }
//            if (myCollection.get(i) < min){
//                min = myCollection.get(i);
//            }
//        }
        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);
        int maxIndex = myCollection.indexOf(max);
        int minIndex = myCollection.indexOf(min);
        System.out.println(myCollection);
        Collections.swap(myCollection, maxIndex, minIndex);
        System.out.println(myCollection + "  Swap the maximum and minimum");

        int negativeInt = 0;
        for (int i = 0; i < n; i++){
            if (myCollection.get(i) < 0){
                negativeInt = myCollection.get(i);
                break;
            }
        }
        int negativeIndex = myCollection.indexOf(negativeInt);
        int randomNumber = random.nextInt(900) + 100;
        myCollection.add(negativeIndex,randomNumber);
        System.out.println(myCollection + "  Insert a random three-digit number before the first negative element of the list");

        int k = 5;

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.addAll(myCollection.subList(0,k));

        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);


        for (int i = myCollection.size() - 1; i >= 0;){
             int number = myCollection.get(i);
             if (number % 2 == 0){
                 myCollection.remove(i);
                 System.out.println(myCollection + " Even last element removed");
             }else {
                 System.out.println("There is no last even element in the list");
             }
             break;
        }
        System.out.println(myCollection);
        int min2Index = myCollection.indexOf(min);
        System.out.println(min);
        if (minIndex < myCollection.size() - 1){
            myCollection.remove(min2Index + 1);
        }
        System.out.println(myCollection + " " + "Remove from the list myCollection the element following the first minimum");

    }

}
