package lesson6.practical;

public class PointDemo {
    public static void main(String[] args) {
        Line[] lines = new Line[4];
        lines[0] = new Line(new Point(1, 1), 10);
        lines[1] = new ColorLine(new Point(2, 2), 20, "black");
        lines[2] = new Line(new Point(3, 3), 30);
        lines[3] = new ColorLine(new Point(4, 4), 40, "white");

        for (var line : lines) {
            line.print();
        }
    }
}
