package homework.homework16.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class PrivateFile {
    public static void main(String[] args) {
        String fileName = "src/homework/homework16/task1/file1.java";

        try {
            String nFileName = "src/homework/homework16/task2/file.txt";
            var nFile = new File(nFileName);
            String[] lines = Files.lines(Path.of(fileName)).toArray(String[]::new);
            for (var line : lines) {
                if (line.contains("public")){
                    line = line.replace("public","private");
                }
                System.out.println(line);
                Files.writeString(nFile.toPath(), "\n"+line, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
        }



    }
}
