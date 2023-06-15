package practical.lesson9.task9_1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(10,"Toys"));
        boxes.add(new HeavyBox(15,"Fish"));
        boxes.add(new HeavyBox(5,"Plates"));
        for(var box : boxes){
            System.out.println(box.getContents());
        }
        boxes.get(0).setWeight(1);
        boxes.remove(2);
        System.out.println("Boxes before remove all " + boxes);
        boxes.removeAll(boxes);
        System.out.println("Boxes after remove all " + boxes);
    }
}
