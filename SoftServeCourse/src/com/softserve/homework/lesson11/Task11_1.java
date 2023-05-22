package homework.lesson11;

import java.util.Scanner;

public class Task11_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five words separated by commas:");
        String word = scan.nextLine();
        String[] words = word.split(",");
        searchLongestWord(words);
        reverseSecondWord(words);
    }
    static void searchLongestWord(String[] str){
        int size = 0;
        String word = "";
        for(int i = 0;i < str.length;i++){
            if(str[i].length() > size){
                size = str[i].length();
                word = str[i];
            }
        }
        System.out.printf("The longest word is %s,and its length is %d%n",word,size);
    }
    static void reverseSecondWord(String[] str){
        System.out.println("Reverse second word - " + new StringBuilder(str[1]).reverse());
    }
}
