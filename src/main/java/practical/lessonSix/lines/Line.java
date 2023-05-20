package practical.lessonSix.lines;

public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point starPoint, Point endPoint) {
        this.startPoint = starPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    @Override
    public String toString() {
        return "I'm a line from point " + getStartPoint() + " to point " + getStartPoint();
    }
}
