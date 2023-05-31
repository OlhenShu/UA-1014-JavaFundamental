package homework.lesson13.task13_1;

import homework.lesson12.task12_1.DivideByZeroException;
import homework.lesson13.task13_1.OutOfAlphabetRangeException;

public class Main {
    public static void main(String[] args) {
        
    }
    public static StringBuilder encrypt(String s,int i){
        StringBuilder str = new StringBuilder();
        try {
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                c += i;
                if (c < 'a' || c > 'z') {
                    throw new OutOfAlphabetRangeException("If letter '" + s.charAt(j) + "' range " + i +
                            " it's out of alphabet range,return letter 'z'" );
                } else {
                    str.append(c);
                }
            }
        }
        catch (OutOfAlphabetRangeException e){
            System.out.println(e.getMessage());
        }
        return str;
    }
    public static StringBuilder decrypt(String s,int i){
        StringBuilder str = new StringBuilder();
        try {
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                c -= i;
                if (c < 'a' || c > 'z') {
                    throw new OutOfAlphabetRangeException("If letter '" + s.charAt(j) + "' minus " + i +
                            " it's out of alphabet range,return letter 'a'" );
                } else {
                    str.append(c);
                }
            }
        }
        catch (OutOfAlphabetRangeException e){
            System.out.println(e.getMessage());
        }
        return str;
    }
}
