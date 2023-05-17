package practicalThirdTask;

public class TestColor {
    public static void main(String[] args) {
        var lines = new Line[3];
        lines[0] = new Line(new Point(0, 0), new Point(10, 10));
        lines[1] = new ColorLine(new Point(5, 5), new Point(15, 15), "Red");
        lines[2] = new ColorLine(new Point(3, 3), new Point(12, 12), "Blue");
        for (var line : lines) {
            line.print();
        }


    }
}
