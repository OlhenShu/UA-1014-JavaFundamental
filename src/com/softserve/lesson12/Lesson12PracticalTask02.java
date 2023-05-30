package com.softserve.lesson12;

import java.util.Scanner;

public class Lesson12PracticalTask02 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        Plant[] plants = new Plant[count];

        for (int i = 0; i < count; i++) {
            Thread.sleep(500);
            System.out.print("Input type: ");
            String type = scanner.next();

            System.out.print("Input color: ");
            String color = scanner.next();

            System.out.print("Input size: ");
            int size = scanner.nextInt();
            try {
                plants[i] = new Plant(type, color, size);
                System.out.println(plants[i]);

            } catch (ColorException | TypeException | SizeException | ColorTypeException e) {
                System.err.println(e.getMessage() + "\n");
            }
        }
    }
}

enum Color {WHITE, RED, BLUE}

enum Type {CHLOROPHYTA, BRYOPHYTA, MAGNOLIOPHYTA}

class ColorException extends Exception {
    public ColorException(String arg0) {
        super(arg0);
    }
}

class TypeException extends Exception {
    public TypeException(String arg0) {
        super(arg0);
    }
}

class SizeException extends Exception {
    public SizeException(String arg0) {
        super(arg0);
    }
}

class ColorTypeException extends Exception {
    public ColorTypeException(String arg0) {
        super(arg0);
    }
}

class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException, SizeException, ColorTypeException {
        colorType(color, type);
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        int s = sizePlant(size);
        this.size = s;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.BLUE;
            case "red":
                return Color.RED;
            case "white":
                return Color.WHITE;
            default:
                throw new ColorException("Input only color blue, red or white");
        }
    }

    private Type typeStrToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "chlorophyta":
                return Type.CHLOROPHYTA;
            case "bryophyta":
                return Type.BRYOPHYTA;
            case "magnoliophyta":
                return Type.MAGNOLIOPHYTA;
            default:
                throw new TypeException("Input only type chlorophyta, bryophyta or magnoliophyta");
        }
    }

    private int sizePlant(int size) throws SizeException {
        if (size > 0 && size < 100) {
            return size;
        } else {
            throw new SizeException("Input only size > 0 and size < 100");
        }
    }

    private void colorType(String color, String type) throws ColorTypeException {
        int tmp = 0;

        switch (color.toLowerCase()) {
            case "blue":
            case "red":
            case "white":
                break;
            default:
                tmp++;
        }

        switch (type.toLowerCase()) {
            case "chlorophyta":
            case "bryophyta":
            case "magnoliophyta":
                break;
            default:
                tmp++;
        }

        if (tmp == 2) {
            throw new ColorTypeException("Input only color blue, red or white and " +
                    "Input only type chlorophyta, bryophyta or magnoliophyta");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "type=" + type +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
