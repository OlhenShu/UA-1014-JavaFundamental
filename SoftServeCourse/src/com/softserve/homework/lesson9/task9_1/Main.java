package homework.lesson9.task9_1;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        List<Integer> myCollections = new ArrayList<>();
        randomInput(myCollections);
        swapMinAndMax(myCollections);
        addThreeDigitRandomNumber(myCollections);
        insertZero(myCollections);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        copyKElementsList1AndList2(myCollections,list1,list2);
        deleteLastEvenNumber(myCollections);
        removeNextElementAfterMinimum(myCollections);
    }
    public static void randomInput(List <Integer>integers){
        Random random1 = new Random();
        int n = 10;
        for (int i = 0;i < n;i++){
            integers.add(random1.nextInt(-40,40));
        }
        System.out.println("Generated arraylist - " + integers);
    }
    public static void swapMinAndMax(List <Integer> integers){
        Collections.sort(integers);
        Collections.swap(integers,0,9);
        System.out.println("List after swap minimum and maximum elements - " + integers);
    }
    public static void addThreeDigitRandomNumber(List <Integer> integers){
        Random random2 = new Random();
        for(int i = 0;i < integers.size();i++){
            if(integers.get(i) < 0){
                integers.add(i,random2.nextInt(110,200));
                System.out.println("Add three-digit number - " + integers.get(i));
                System.out.println(integers);
                break;
            }
        }
    }
    public static void insertZero(List <Integer> integers){
        for(int i = 0;i < integers.size() - 1;i++){
           if (integers.get(i) < 0 && integers.get(i + 1) > 0){
               integers.add(i + 1,0);
           }
           if(integers.get(i) > 0 && integers.get(i + 1) < 0){
               integers.add(i + 1,0);
           }
        }
        System.out.println("myCollections after insert zero between all neighboring elements" +
                " with different signs - " + integers);
    }
    public static void copyKElementsList1AndList2(List <Integer> integers,List <Integer> list1,List <Integer> list2){
        Random random3 = new Random();
        int n = integers.size();
        int k = random3.nextInt(n + 1);
        list1.addAll(integers.subList(0,k));
        list2.addAll(list1);
        Collections.reverse(list2);
        System.out.println("List1 - " + list1);
        System.out.println("List2 - " + list2);
    }
    public static void deleteLastEvenNumber(List <Integer> integers){
        int n = integers.size();
        int indexEvenNumber = -1;
        for(int i = 0;i < n;i++){
            if(integers.get(i) % 2 == 0 && integers.get(i) > 0){
                indexEvenNumber = i;
            }
        }
        if(indexEvenNumber >= 0){
            integers.remove(indexEvenNumber);
            System.out.println("List myCollections after remove the last even number - " + integers);
        }
        else {
            System.out.println("List myCollections doesn't have even number");
        }
    }
    public static void removeNextElementAfterMinimum(List <Integer> integers){
        int n = integers.size();
        int minimum = 0;
        int indexMinimum = 0;
        for(int i = 0;i < n;i++){
            if(integers.get(i) < minimum){
                minimum = integers.get(i);
                indexMinimum = i;
            }
        }
        if(n == (indexMinimum + 1)){
            System.out.println("Minimum it is a last element");
        }
        else {
            integers.remove(indexMinimum + 1);
            System.out.println("Remove next element after minimum - " + integers);
        }
    }
}
