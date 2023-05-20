package practical.lessonSix.lines;

public class ColorLine extends Line {
    Color color;

    public ColorLine(Point starPoint, Point endPoint, Color color) {
        super(starPoint, endPoint);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + " in " + getColor() + " color";
    }
}
