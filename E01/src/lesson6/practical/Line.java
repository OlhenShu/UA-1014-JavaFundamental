package lesson6.practical;

public class Line {
    private Point point;
    private int length;

    public Line(Point point, int length) {
        this.length = length;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Line{" +
                "point=" + point +
                ", length=" + length +
                '}';
    }

    public void print() {
        System.out.println(this.toString());
    }
}


