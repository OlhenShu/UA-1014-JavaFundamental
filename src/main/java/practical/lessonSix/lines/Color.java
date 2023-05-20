package practical.lessonSix.lines;

public class Color {
    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getColor();
    }
}
