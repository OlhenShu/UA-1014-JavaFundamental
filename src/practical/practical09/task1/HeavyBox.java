package practical.practical09.task1;

import java.util.ArrayList;
import java.util.List;

public class HeavyBox {
    private int weight;
    private String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public String getContents() {
        return contents;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", contents='" + contents + '\'' +
                '}';
    }
}
class ForMain{
    public static void main(String[] args){
        HeavyBox box1 = new HeavyBox(2, "apple");
        HeavyBox box2 = new HeavyBox(5, "mango");
        HeavyBox box3 = new HeavyBox(4,"banana");
        List<HeavyBox> allBox = new ArrayList<>();
        allBox.add(box1);
        allBox.add(box2);
        allBox.add(box3);
        printAll(allBox, "Initial collection of boxes: ");
        allBox.get(0).setWeight(1);
        allBox.remove(allBox.size()-1);
        printAll(allBox, "Collection of boxes after changes: ");
        allBox.clear();
        printAll(allBox, "Boxes after removal:");

    }
    public static void printAll(List<HeavyBox> allBox, String prompt){
        System.out.println(prompt);
        for (HeavyBox box:allBox){
            System.out.println(box.toString());
        }
    }
}
