package homework.lesson12.task12_2;

import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> list;
        list = readNumber(1,100);
        System.out.println("Your list - "  + list);

    }
    public static List<Integer> readNumber(int start,int end) {
        List<Integer> integerList = new ArrayList<>(10);
        try {
            System.out.println("Input 10 numbers (a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100)");
            for (int i = 0; i < 10; i++) {
                System.out.print("Input number " + (i + 1) + ":");
                int num = in.nextInt();
                if (num > start && num < end) {
                    integerList.add(num);
                } else {
                    throw new OutOfRangeException( num + " is out of the range");
                }
                start = num;
            }
        }
        catch (OutOfRangeException e){
            System.out.println(e.getMessage() + ", return not completed list");
            return integerList;
        }
        catch (InputMismatchException e){
            System.out.println("Incorrect input, return not completed list");
            return integerList;
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
            return integerList;
        }
            return integerList;
    }
}
