package com.softserve.edu16.practicalTask.myText;

import java.io.File;
import java.io.IOException;

/**
 * Prepare mytext.txt file with a lot of text inside.
 * Read context from file into array of strings.
 * Each array item contains one line from file.
 * Complete next tasks:
 * 1) count and write the number of symbols in every line.
 * 2) find the longest and the shortest line.
 * 3) find and write only that lines, which consist of word «var»
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "com/softserve/edu16/practicalTask/myText";
        String fileName = "mytext.txt";

        File file = MyText.createFile(filePath, fileName);
        MyText.writeFile(file, """
                line 1
                line 2
                var
                asd erjoogij
                qwe qwe
                qqwwe ewwqq
                """);
        String[] lines = MyText.readFileToArray(filePath + "/" + fileName);

        //count and write the number of symbols in every line.
        MyText.printLineLengths(lines);

        //find the longest and the shortest line.
        var ArrayStringLength = new MyText.ArrayStringLength(lines);
        System.out.println(ArrayStringLength.longestLine());
        System.out.println(ArrayStringLength.shortestLine());

        //find and write only that lines, which consist of word «var»
        MyText.printEqualsWord(lines, "var");
    }
}
