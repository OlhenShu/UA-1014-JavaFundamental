package com.softserve.edu09.practicalTask.heavyBox;

import java.util.List;

public class HeavyBox {
    private int weight;
    private String contents;

    public HeavyBox(int weight, String contents) {
        setWeight(weight);
        setContents(contents);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public static void showBoxes(List<HeavyBox> boxes) {
        for (HeavyBox box : boxes) {
            System.out.printf("Box contents: %s, weight: %d%n", box.getContents(), box.getWeight());
        }
    }
}

