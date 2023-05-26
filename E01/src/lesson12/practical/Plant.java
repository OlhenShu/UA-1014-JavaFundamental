package lesson12.practical;

enum Color {
    RED, GREEN, BLUE
}

enum Type {
    FLOWER, TREE, SHRUB
}

class ColorException extends Exception {
    public ColorException(String message) {
        super(message);
    }
}

class TypeException extends Exception {
    public TypeException(String message) {
        super(message);
    }
}

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) throws ColorException, TypeException {
        if (!isValidColor(color)) {
            throw new ColorException("Invalid color");
        }
        if (!isValidType(type)) {
            throw new TypeException("Invalid type");
        }
        this.size = size;
        this.color = color;
        this.type = type;
    }

    private boolean isValidColor(Color color) {
        return color == Color.RED || color == Color.GREEN || color == Color.BLUE;
    }

    private boolean isValidType(Type type) {
        return type == Type.FLOWER || type == Type.TREE || type == Type.SHRUB;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}


