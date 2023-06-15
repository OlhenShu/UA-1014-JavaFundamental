package homework.lesson16;

import java.io.*;

public class Task16_2 {
    public static void main(String[] args)  {
        String fileName = "javaClass.txt";
        File testFile = new File(fileName);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(testFile))){
            bw.write("""
                    public class Employee{
                    public String name;
                    public double salary;
                    public int id;
                    public void getSalary(){
                    return salary;
                    }
                    """);
        }catch (IOException e){
            throw new RuntimeException();
        }
        String fileName2 = "modifiedJavaClass.txt";
        File modifiedFile = new File(fileName2);
        try(BufferedReader br = new BufferedReader(new FileReader(testFile));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(modifiedFile))){
            String s = null;
            while((s = br.readLine()) != null){
                if(s.contains("public")){
                    if(s.contains("public class")){
                        bw2.write(s);
                        System.out.println(s);
                        bw2.newLine();
                        continue;
                    }
                    s = s.replace("public","private");
                }
                bw2.write(s);
                bw2.newLine();
                System.out.println(s);
            }
        }
        catch (IOException e){
            throw new RuntimeException();
        }
    }
}
