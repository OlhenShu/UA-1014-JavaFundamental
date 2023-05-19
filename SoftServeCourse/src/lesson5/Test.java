package edu05;

import javax.xml.transform.SourceLocator;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Person[] persons = {new Person("Kate", 18),
                            new Person("Anna", 30)};
        System.out.println(Arrays.toString(persons));
//  int[] monthDays = new int [12];
//  monthDays[0] = 31;
//  monthDays[1] = 28;
//// . . .
//  monthDays [11] =31;

        int n = monthDays.length;

        //System.out.println(n);
        //System.out.println(monthDays[11]);
        //System.out.println(Arrays.toString(monthDays));
        //chartwod1[][]= newchar[3][4];
        char[][] twod2= new char[3][];

        double[][] m= { {0, 1, 2, 3},
                        {4, 5, 6, 7},
                        {8, 9, 10, 11},
                        {12, 13, 14, 15} };
         System.out.println(m[1][2]);
         System.out.println(m[3][3]);
        int[][]irregular={{1},
                         {2,3,4},
                         {5},
                         {6,7}};
    }
}