package practical.lessonTwelve.task2;

public class Plant {
    private int size;
    private Type type;
    private Color color;

    public enum Type {FLOWER, TREE, SHRUB};
    public enum Color {GREEN, YELLOW, ORANGE, RED};

    public Plant(int size, Type type, Color color) throws SizeException, TypeException, ColorException {
        setSize(size);
        setType(type);
        setColor(color);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) throws SizeException {
        if (size < 1 || size > 7) {
            throw new SizeException("Invalid size. Size must be between 1 and 7");
        }
        this.size = size;
    }
    
    public Type getType() {
        return type;
    }

    public void setType(Type type) throws TypeException {
        if (type == null || !isValidType(type)) {
            throw new TypeException("Invalid type. Type cannot be null and must be valid");
        }
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) throws ColorException {
        if (color == null || !isValidColor(color)) {
            throw new ColorException("Invalid color. Color cannot be null and must be valid");
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": type = " + getType()
        + ", color = " + getColor() + ", size = " + getSize();
    }

    private boolean isValidType(Type type) {
        for (Type validType : Type.values()) {
            if (validType == type) return true;
        }
        return false;
    }

    private boolean isValidColor(Color color) {
        for (Color validColor : Color.values()) {
            if (validColor == color) return true;
        }
        return false;
    }
}