package practical.lesson6.task6_3;

public class Line {
    private Point point1;
    private Point point2;
    public Line(Point p1, Point p2){
        this.point1 = p1;
        this.point2 = p2;
    }
    @Override
    public String toString(){
        return  "Line first " + point1.toString()
                + "\n     second " + point2.toString();
    }
    public void print(){
        System.out.println(toString());
    }
}
