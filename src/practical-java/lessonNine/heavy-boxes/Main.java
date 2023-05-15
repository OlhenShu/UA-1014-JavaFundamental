package lessonNine.heavy-boxes;

import java.util.ArrayList;
import java.util.List;

class HeavyBox {
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
}

public class Main {
    public static void main(String[] args) {
        
        List<HeavyBox> heavyBoxes = new ArrayList<>();

        heavyBoxes.add(new HeavyBox(5, "Box1"));
        heavyBoxes.add(new HeavyBox(7, "Box2"));
        heavyBoxes.add(new HeavyBox(2, "Box3"));
        heavyBoxes.add(new HeavyBox(15, "Box4"));
        heavyBoxes.add(new HeavyBox(10, "Box5"));
        heavyBoxes.add(new HeavyBox(9, "Box6"));

        for (HeavyBox boxes : heavyBoxes) {
            System.out.println("Weight: " + boxes.getWeight() + ", Contentes: " + boxes.getContents());
        }

        HeavyBox firstBox = heavyBoxes.get(0);
        firstBox.setWeight(firstBox.getWeight() + 1);
        System.out.println("Weight of first box: " + heavyBoxes.get(0).getWeight());

        heavyBoxes.remove(heavyBoxes.size() - 1);
        System.out.println();

        for (HeavyBox boxes : heavyBoxes) {
            System.out.println("Weight: " + boxes.getWeight() + ", Contentes: " + boxes.getContents());
        }

        if (!heavyBoxes.isEmpty()) heavyBoxes.removeAll(heavyBoxes);

        System.out.println("\nBoxes are empty: " + heavyBoxes.isEmpty());

    }
}
