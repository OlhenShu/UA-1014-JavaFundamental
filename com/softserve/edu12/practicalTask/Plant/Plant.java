package com.softserve.edu12.practicalTask.Plant;

/**
 * To complete the given task, it is required to create a class named Plant which includes the following fields:
 * int size, Color color (an Enum), Type type (an Enum)
 * A constructor must be created to initialize these fields. The toString() method should be overridden to provide a
 * string representation of the Plant object. Two separate classes named ColorException and TypeException should be
 * created to describe all possible colors and types of plants respectively. In the main() method, an array of five plants
 * should be created, and it should be ensured that the exception handling is working correctly for invalid color and type
 * values.
 * **Add a method that will verify whether the size of the plant is correct and throw an exception if it is too small or too
 * large.
 * **Add a method that will verify whether the color and type are both valid and throw an exception if invalid
 * parameters are entered.
 */
public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(String type, String color, int size) throws ColorException, TypeException, SizeException {
        setType(type);
        setColor(color);
        setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) throws SizeException {
        if (size < 1 || size > 10) {
            throw new SizeException("Invalid size. Size must be between 1 and 10.");
        }

        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(String color) throws ColorException {
        if (color == null) {
            throw new ColorException("Invalid color. Color must be specified.");
        }

        this.color = colorStrToEnum(color);
    }

    public Type getType() {
        return type;
    }

    public void setType(String type) throws TypeException {
        if (type == null) {
            throw new TypeException("Invalid type. Type must be specified.");
        }

        this.type = typeStrToEnum(type);
    }

    private Color colorStrToEnum(String color) throws ColorException {
        return switch (color.toLowerCase()) {
            case "red" -> Color.RED;
            case "green" -> Color.GREEN;
            case "blue" -> Color.BLUE;
            case "yellow" -> Color.YELLOW;
            default -> throw new ColorException("Input only color red, green, blue or yellow;");
        };
    }

    private Type typeStrToEnum(String type) throws TypeException {
        return switch (type.toLowerCase()) {
            case "flower" -> Type.FLOWER;
            case "wood" -> Type.WOOD;
            case "shrub" -> Type.SHRUB;
            default -> throw new TypeException("Input only type flower, wood or shrub;");
        };
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + getSize() +
                ", color=" + getColor() +
                ", type=" + getType() +
                '}';
    }
}

enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW
}

enum Type {
    FLOWER,
    WOOD,
    SHRUB
}