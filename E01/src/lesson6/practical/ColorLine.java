package lesson6.practical;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point point, int length, String color) {
        super(point, length);
        this.color=color;
    }

    @Override
    public String toString() {
        return super.toString() + "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }

    public void print() {
        System.out.println(this.toString());
    }
}
