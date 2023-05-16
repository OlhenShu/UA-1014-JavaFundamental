package practicalThirdTask;

public class ColorLine extends Line {
    public String color;


    public ColorLine(Point start, Point end,String color) {
        super(start, end);
        this.color = color;
    }
    public String toString() {
        return super.toString() + " (Color: " + color + ")";
    }

    public void print() {
        System.out.println(toString());
    }
}
