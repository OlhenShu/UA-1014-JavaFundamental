package homework16;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class homework16Task1 {
    public  static void main(String[] args) throws IOException{
        String nameFile = "text.txt";
        File file1 = new File(nameFile);
        String nameFile2 = "text2.txt";
        File file2 = new File(nameFile2);

        try(var bw = new BufferedWriter(new FileWriter(file1))){
            bw.write("""
                    My career started in 2015
                    I worked for an IT company.
                                             """);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] strings = Files.lines(Path.of(nameFile))
                .toArray(String[] :: new);

        for (String e :  strings){
            System.out.println(e);
        }
        IntSummaryStatistics iss = Arrays.stream(strings)
                        .mapToInt(String :: length)
                                .summaryStatistics();
        int count = (int) iss.getCount();
        int max = iss.getMax();

        try (var bw = new BufferedWriter(new FileWriter(file2))){
            bw.write("Number of lines in file.txt: " + count + "\n");
            bw.write("The longest line in file.txt: " + max + "\n");
            bw.write("""
                    Vivdenko
                    Serhii
                    02.04.1984
                          """);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] strings2 = Files.lines(Path.of(nameFile2))
                .toArray(String[] :: new);

        for (String e :  strings2){
            System.out.println(e);
        }

    }
}
