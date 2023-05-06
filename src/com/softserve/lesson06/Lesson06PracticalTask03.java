package com.softserve.lesson06;

import java.util.Scanner;

public class Lesson06PracticalTask03 {
    public static void main(String[] args) {
        int countLine = 4;
        Line[] lines = new Line[countLine];
        for (int i = 0; i < countLine / 2; i++) {
            lines[i] = new Line();
            lines[i].input();
        }
        for (int i = countLine / 2; i < countLine; i++) {
            lines[i] = new ColorLine();
            lines[i].input();
        }
        for (int i = 0; i < countLine; i++) {
            lines[i].print();
        }
    }
}

class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void print() {
        System.out.println(this);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x ");
        setX(scanner.nextDouble());
        System.out.print("Input y ");
        setY(scanner.nextDouble());
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Line {
    Point point1 = new Point();
    Point point2 = new Point();

    public void print() {
        System.out.println(this);
    }

    public void input() {
        point1.input();
        point2.input();
    }

    @Override
    public String toString() {
        return "Line{" +
                "point1: x= " + point1.getX() + "  y=" + point1.getY() +
                ", point2: x=" + point2.getX() + "  y=" + point2.getY() +
                '}';
    }
}

class ColorLine extends Line {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Input color ");
        color = scanner.next();
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "point1: x=" + point1.getX() + "  y=" + point1.getY() +
                ", point2: x=" + point2.getX() + "  y=" + point2.getY() +
                ", color='" + color + '\'' +
                '}';
    }
}
