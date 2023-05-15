package com.softserve.edu09.practicalTask.heavyBox;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(10, "Box first"));
        boxes.add(new HeavyBox(20, "Box second"));
        boxes.add(new HeavyBox(30, "Box third"));

        HeavyBox.showBoxes(boxes);

        // change weight of the first box
        boxes.get(0).setWeight(11);

        // remove last box
        boxes.remove(boxes.size() - 1);

        HeavyBox.showBoxes(boxes);

        // remove all boxes
        boxes.clear();

        HeavyBox.showBoxes(boxes);
    }
}

