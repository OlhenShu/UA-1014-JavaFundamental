package practical.lesson6.task6_3;

public class ColorLine extends Line{
    private String color;
    public ColorLine(Point point1,Point point2,String color){
        super(point1,point2);
        this.color = color;
    }
    @Override
    public String toString(){
        return  super.toString() + "\n     color is "
                + color;
    }
    @Override
    public void print(){
        System.out.println(toString());
    }
}
