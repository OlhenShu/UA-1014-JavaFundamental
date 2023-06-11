package homework.homework09.task1;

import java.util.*;

public class MyCollection {
    public static void main(String[] args){
        List<Integer> myCollection = new ArrayList<>();
        Random rnd = new Random();
        int n = 10;
        for (int i = 0; i< n; i++){
            myCollection.add(rnd.nextInt(-10,10));
        }
        //Swap the maximum and minimum elements in the list
        swapMaxAndMin(myCollection);
        //Insert a random three-digit number before the first negative element of the list
        insertThreeDigitNumber(myCollection,rnd);
        //Insert a zero between all neighboring elements collection myCollection with different signs
        insertZero(myCollection);
        /*Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
        list2 in reverse order*/
        System.out.println(endReverse(myCollection));
        /*In a list myCollection remove the last even element (if there are even elements in the list). If
        there is no such element, display a message*/
        System.out.println(lastEvenElement(myCollection));
        /*Remove from the list myCollection the element following the first minimum. If the minimum
        element is the last one, nothing needs to be removed*/
        minNextRemove(myCollection);
    }
    public static void swapMaxAndMin(List<Integer> myCollection){
        try {
            int min = Collections.min(myCollection);
            int max = Collections.max(myCollection);
            int indexMin = myCollection.indexOf(min);
            int indexMax = myCollection.indexOf(max);
            System.out.println("Collection: " + myCollection + ", max = " + max + ", indexMax = " + indexMax +
                    ", min = " + min + ", indexMin = " + indexMin);
            myCollection.set(indexMin, max);
            myCollection.set(indexMax, min);
            System.out.println(myCollection);
        }catch (NoSuchElementException e) {
            System.out.println("The collection is empty. Unable to swap max and min elements.");
        }
    }


    public static void insertThreeDigitNumber(List<Integer> myCollection, Random rnd){
        int negativeElement = 0;
        for(int i = 0; i < myCollection.size(); i++){
            if (negativeElement == 0){
                if(myCollection.get(i) < 0){
                    negativeElement = myCollection.get(i);
                }
            }
        }
        int previousNegative = myCollection.indexOf(negativeElement) ;

        myCollection.add(previousNegative, rnd.nextInt(100, 999));

        System.out.println(myCollection);
    }
    public static void insertZero(List<Integer> myCollection){
        List<Integer> index = new ArrayList<>();
        for(int i = 1; i < myCollection.size(); i++){
            if((myCollection.get(i) < 0 && myCollection.get(i-1) > 0) ||
                    (myCollection.get(i) > 0 && myCollection.get(i-1) < 0)){
                index.add(0,i);
            }
        }
        for (int i :index){
            myCollection.add(i, 0);
        }
        System.out.println(myCollection);
    }
    public static List<Integer> endReverse(List<Integer> myCollection){
        int k = 7;
        List<Integer> newCollection = new ArrayList<>(List.copyOf(myCollection));
        List<Integer> n = newCollection.subList(k, myCollection.size());
        Collections.reverse(n);
        return newCollection;
    }
    public static List<Integer> lastEvenElement(List<Integer> myCollection){
        int evenElement = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (((myCollection.get(i) % 2) == 0) && !(myCollection.get(i) == 0)) {
                evenElement = i;
            }
        }
        if (evenElement == -1){
            System.out.println("There is no such element");
        }else {
            myCollection.remove(evenElement);
        }
        return myCollection;
    }

    public static void minNextRemove(List<Integer> myCollection){
        int min = Collections.min(myCollection);
        int indexMin = myCollection.indexOf(min);
        if (!(indexMin == myCollection.size())){
            myCollection.remove((indexMin+1));
        }
        System.out.println(myCollection);
    }
}
