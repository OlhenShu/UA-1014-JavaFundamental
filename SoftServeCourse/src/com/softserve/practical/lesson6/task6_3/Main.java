package practical.lesson6.task6_3;

public class Main {
    public static void main(String[] args) {
        Line[] countLine = {
              new Line(new Point(2,7),new Point(16,-10)),
                new ColorLine(new Point(12,12),new Point(-20,15),"Yellow"),
                new Line(new Point(-3,-13),new Point(10,-10)),
                new ColorLine(new Point(-12,-3),new Point(5,23),"Red"),
        };
        for (int i = 0;i < countLine.length;i++){
            countLine[i].print();
        }
    }
}
