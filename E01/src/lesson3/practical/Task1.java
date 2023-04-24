package lesson3.practical;

import java.util.Scanner;

public class Task1 {


    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public int getNumber2() {
        return number2;
    }


    int getTotal () {
        int s = number1 + number2;
        return s;
    };

    double getAverage(){
        double av = (number1 + number2) / 2;
        return av;
    }
    static void getNumber (Task1 t) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        t.setNumber1(number1);
        System.out.println("Enter the second number:");

        int number2 = scanner.nextInt();
        t.setNumber2(number2);
    }
}

class  Demo {
    public static void main (String[] args) {
        Task1 t1 = new Task1 ();
        Task1.getNumber(t1);

        System.out.println("The sum is " + t1.getTotal());

        System.out.println("The average is " + t1.getAverage());
    }
}

