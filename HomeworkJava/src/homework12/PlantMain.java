package homework12;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PlantMain {
    public static void main(String[] args){
        try {
            Plant pl = new Plant("ros", "white", 5);
            System.out.println(pl);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
           // e.printStackTrace();
        }
    }
}
