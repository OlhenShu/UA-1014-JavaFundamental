package practical.practical09.task3;

import java.util.*;


public class Task3 {
    public static void main(String[] args){
        List<Integer> myCollection = new ArrayList<>();
        Random rnd = new Random();
        int n = 10;
        for (int i = 0; i< n; i++){
            myCollection.add(rnd.nextInt(50));
        }
        System.out.println(myCollection);
        myCollection.add(2, 1);
        myCollection.add(8,-3);
        myCollection.add(5,-4);
        for(int i = 0; i < myCollection.size(); i++) {
            System.out.println("position – " + i + ", value of element – " + myCollection.get(i));
        }
        List<Integer> newCollectijn = new ArrayList<>();
        for(int i = 0; i < myCollection.size(); i++){
            if(myCollection.get(i) > 25){
                newCollectijn.add(i);
            }
        }
        System.out.println(newCollectijn);
        var it = myCollection.iterator();
        while (it.hasNext()){
            var el = it.next();
            if (el >20){
                it.remove();
            }
        }
        System.out.println(myCollection);
        Collections.sort(myCollection);
        System.out.println(myCollection);
    }
}
