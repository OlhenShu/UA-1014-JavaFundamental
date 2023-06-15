package practical.lesson6.task6_3;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return " point - x = " + x
                + ", y = " + y;
    }
    public void print(){
        System.out.println(toString());
    }

}
