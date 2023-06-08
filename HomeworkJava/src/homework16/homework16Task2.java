package homework16;
import java.io.*;

public class homework16Task2 {
    public static void main(String[] args) throws IOException {
        String inputFile = "textTask2.txt";
        File file = new File(inputFile);
        String outputFile = "modified.txt";
        File file2 = new File(outputFile);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("""
                    public class MyClass {
                               public int;
                               private String;
                               
                               private void publicMethod() {
                               }
                               """);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line.contains("public") ;
                line = line.replace("public", "private");

                writer.write(line);
                writer.newLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
