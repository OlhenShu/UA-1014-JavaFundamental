package lesson16.homework;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        String filename1 = "input";
        String filename2 = "output";

        String code = readFromFile(filename1);

        String modifiedCode = modifyCode(code);

        writeToFile(filename2, modifiedCode);
    }

    public static String readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }

            return content.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String modifyCode(String code) {
        return code.replaceAll("\\bpublic\\b", "private");
    }

    public static void writeToFile(String filename, String modifiedCode) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(modifiedCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
