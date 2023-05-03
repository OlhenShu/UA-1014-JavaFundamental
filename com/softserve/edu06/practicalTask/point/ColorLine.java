package com.softserve.edu06.practicalTask.point;

public class ColorLine extends Line {
    private final String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + getColor() + '\'' +
                "start='" + getStart() + '\'' +
                "end='" + getEnd() + '\'' +
                '}';
    }

    @Override
    public void print() {
        super.print();
    }
}
