package com.softserve.edu06.practicalTask.point;

public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[4];

        Point start1 = new Point(5, 5);
        Point end1 = new Point(4, 4);
        Line line1 = new Line(start1, end1);

        Point start2 = new Point(10, 10);
        Point end2 = new Point(22, 22);
        ColorLine colorLine1 = new ColorLine(start2, end2, "red");

        Point start3 = new Point(45, 45);
        Point end3 = new Point(15, 15);
        Line line2 = new Line(start3, end3);

        Point start4 = new Point(30, 30);
        Point end4 = new Point(40, 40);
        ColorLine colorLine2 = new ColorLine(start4, end4, "blue");

        lines[0] = line1;
        lines[1] = colorLine1;
        lines[2] = line2;
        lines[3] = colorLine2;

        for (Line line : lines) {
            line.print();
        }
    }
}
