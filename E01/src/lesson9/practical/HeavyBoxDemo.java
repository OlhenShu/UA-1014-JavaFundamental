package lesson9.practical;

import java.util.ArrayList;

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

public class HeavyBoxDemo {
    public static void main(String[] args) {
        ArrayList<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(10, "Fruits"));
        list.add(new HeavyBox(15, "Gadgets"));
        list.add(new HeavyBox(18, "Clothes"));

        for (HeavyBox box : list) {
            System.out.println("Box contents: " + box.getContents() + ", Box weight: " + box.getWeight());
        }

        list.get(0).setWeight(1);

        list.remove(list.size()-1);

        for (HeavyBox box : list) {
            System.out.println("Box contents: " + box.getContents() + ", Box weight: " + box.getWeight());
        }

        list.clear();

        for (HeavyBox box : list) {
            System.out.println("Box contents: " + box.getContents() + ", Box weight: " + box.getWeight());
        }
    }
}

