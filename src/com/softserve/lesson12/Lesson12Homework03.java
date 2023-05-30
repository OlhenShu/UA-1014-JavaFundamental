package com.softserve.lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson12Homework03 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Triangle triangle = new Triangle();

            System.out.print("Input Size 1: ");
            triangle.setSize1(scanner.nextDouble());

            if (triangle.getSize1() <= 0) {
                throw new MyExceptionSize1();
            }

            System.out.print("Input Size 2: ");
            triangle.setSize2(scanner.nextDouble());

            if (triangle.getSize2() <= 0) {
                throw new MyExceptionSize2();
            }

            System.out.print("Input Size 3: ");
            triangle.setSize3(scanner.nextDouble());

            if (triangle.getSize3() <= 0) {
                throw new MyExceptionSize3();
            }

            if (triangle.area() > 0) {
                System.out.println("The area of a triangle is " + triangle.area());
            }

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        } catch (MyExceptionSize1 e) {
            System.out.println("Size1 <= 0");
        } catch (MyExceptionSize2 e) {
            System.out.println("Size2 <= 0");
        } catch (MyExceptionSize3 e) {
            System.out.println("Size3 <= 0");
        }
    }
}

class MyExceptionSize1 extends Exception {
}

class MyExceptionSize2 extends Exception {
}

class MyExceptionSize3 extends Exception {
}

class MyExceptionSqrt extends Exception {
}

class Triangle {
    private double size1;
    private double size2;
    private double size3;

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double area() {
        try {
            double p = (size1 + size2 + size3) / 2;
            if (p * (p - size1) * (p - size2) * (p - size3) <= 0) {
                throw new MyExceptionSqrt();
            }
            return Math.sqrt(p * (p - size1) * (p - size2) * (p - size3));
        } catch (MyExceptionSqrt e) {
            System.out.println("p * (p - size1) * (p - size2) * (p - size3) <= 0");
            return 0;
        }
    }
}
