
package com.lesson3;

import java.util.Scanner;

import static com.lesson3.Employee.getTotalSum;

public class pract2 {


    public static void main(String[] args) {
        Employee emp1 = new Employee("Bob", 100,156);
        System.out.println(emp1.toString());
        emp1.setName("Alan");
        emp1.setHours(25);
        emp1.setRate(10);
        System.out.println(emp1.toString());
        Employee emp2 = new Employee("Caren", 200, 200);
        Employee emp3 = new Employee("Dave", 150, 40);
        Employee emp4 = new Employee();
        emp4.setHours(5);
        emp4.setRate(10);
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        System.out.println("Whole salary=" + getTotalSum());
        // Ремарочка: сума зп рахується лише з даних, які ми вказуємо через конструктор.
        // Тобто якщо зробити зміну rate або hours через set...(), то ці дані не беруться до уваги, а рахується з вказаних у конструкторі.
        // Не дуже розумію чому так відбується.

    }
}