package lessonSix.lines;

public class LineTest {
    public static void main(String[] args) {
        Line[] lines = new Line[4];
        Point point1 = new Point(2, 3);
        Point point2 = new Point(1, 5);
        Point point3 = new Point(9, 1);
        Point point4 = new Point(3, 3);

        Color color1 = new Color("green");
        Color color2 = new Color("gray");

        lines[0] = new Line(point1, point3);
        lines[1] = new Line(point4, point2);
        lines[2] = new ColorLine(point2, point1, color1);
        lines[3] = new ColorLine(point3, point4, color2);

        for (Line printLines : lines ) {
            System.out.println(printLines.toString());
        }
    }
}
