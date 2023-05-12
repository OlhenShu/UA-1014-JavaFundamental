package com.softserve.lesson09;

import java.util.ArrayList;
import java.util.Random;

public class Lesson09PracticalTask01 {
    public static void main(String[] args) {
        int countHeavyBox = 5;
        ArrayList<HeavyBox> heavyBoxList = new ArrayList<>();

        for (int i = 0; i < countHeavyBox; i++) {
            HeavyBox heavyBox = new HeavyBox();
            heavyBox.input();
            heavyBoxList.add(heavyBox);
        }

        for (HeavyBox heavy : heavyBoxList) {
            System.out.println(heavy);
        }

        HeavyBox heavyBoxSet = heavyBoxList.get(0);
        heavyBoxSet.setWeight(1);
        heavyBoxList.set(0, heavyBoxSet);
        heavyBoxList.remove(countHeavyBox - 1);

        System.out.println("---------------------");
        for (HeavyBox heavy : heavyBoxList) {
            System.out.println(heavy);
        }

        for (int i = countHeavyBox-2; i >=0; i--) {
            heavyBoxList.remove(i);
        }

        System.out.println("---------------------");
        for (HeavyBox heavy : heavyBoxList) {
            System.out.println(heavy);
        }
    }
}

class HeavyBox {
    private int weight;
    private String content;

    public HeavyBox() {
    }

    public HeavyBox(int weight, String content) {
        this.weight = weight;
        this.content = content;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void input() {
        Random random = new Random();
        char tmp = (char) (random.nextInt(25) + 65);
        content = "" + tmp;

        for (int i = 0; i < 5; i++) {
            tmp = (char) (random.nextInt(25) + 97);
            content += tmp;
        }
        weight = random.nextInt(100);
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                '}';
    }
}

