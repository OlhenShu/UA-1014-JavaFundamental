package com.softserve.edu06.practicalTask.point;

public class Line {
    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + getStart() +
                ", end=" + getEnd() +
                '}';
    }

    public void print() {
        System.out.println(this);
    }
}
