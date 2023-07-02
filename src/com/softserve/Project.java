package com.softserve;

import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.*;

public class Project {
    public static void main(String[] args) {
        List<Fruit> list = new ArrayList<>();

        list.add(new Fruit("apple", "red"));
        list.add(new Fruit("pear", "yellow"));
        list.add(new Fruit("cherry", "red"));
        list.add(new Fruit("plum", "red"));
        list.add(new Fruit("banana", "yellow"));

        list.add(new Citrus("orange", "orange", 5));
        list.add(new Citrus("lemon", "yellow", 6));
        list.add(new Citrus("mandarin", "orange", 4));
        list.add(new Citrus("grapefruit", "yellow", 5));
        list.add(new Citrus("lime", "green", 6));

        for (Fruit fruit : list) {
            if (fruit.getColor().equals("yellow")) {
                System.out.println(fruit);
            }
        }

        Collections.sort(list);
        System.out.println(list);

        Fruit.print("file1.txt", list);
        System.out.println(Fruit.input("file1.txt"));

        Fruit fruit = new Fruit("apple", "green");
        File fw = new File("demo.Xml");
        try (ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw))) {
            ostream.writeObject(fruit);
        } catch (IOException ex) {
            System.err.println(ex);
        }

        File fr = new File("demo.Xml");
        try (ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr))) {
            Fruit unknown = (Fruit) istream.readObject();
            System.out.println(unknown);
        } catch (ClassNotFoundException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

class Fruit implements Comparable<Fruit>, Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String color;

    public Fruit() {
    }

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        name = scanner.next();

        System.out.print("Input color: ");
        color = scanner.next();
    }

    public static List<Fruit> input(String fileName) {
        List<Fruit> fruitList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String s = null;

            while ((s = br.readLine()) != null) {
                if (s.charAt(0) == 'F') {
                    fruitList.add(Fruit.fromString(s));
                } else {
                    fruitList.add(Citrus.fromString(s));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return fruitList;
    }

    public void print() {
        System.out.println(this);
    }

    public void print(String fileName) {
        try {
            File file = new File(fileName);
            Files.writeString(file.toPath(), this.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void print(String fileName, List<Fruit> fruitList) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Fruit fruit : fruitList) {
                bw.write(fruit.toString() + "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public int compareTo(Fruit o) {
        return name.compareTo(o.name);
    }

    public static Fruit fromString(String s) {
        String nameFruit = null;
        String colorFruit = null;

        try {
            Pattern p = Pattern.compile("Fruit\\{name='");
            String str1 = null;
            Matcher m = p.matcher(s);

            while (m.find()) {
                str1 = s.substring(m.end());
            }

            String str2 = null;
            m = Pattern.compile("', color='").matcher(str1);

            while (m.find()) {
                nameFruit = str1.substring(0, m.start());
                str2 = str1.substring(m.end());
            }

            m = Pattern.compile("'}").matcher(str2);

            while (m.find()) {
                colorFruit = str2.substring(0, m.start());
            }
        } catch (Exception ex) {
            //System.err.println(ex);
        }
        return new Fruit(nameFruit, colorFruit);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

class Citrus extends Fruit implements Comparable<Fruit>, Serializable {
    private static final long serialVersionUID = 1L;
    private double vitaminC;

    public Citrus() {
    }

    public Citrus(String name, String color, double vitaminC) {
        super(name, color);
        this.vitaminC = vitaminC;
    }

    public double getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(double vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        String s1 = scanner.next();
        super.setName(s1);

        System.out.print("Input color: ");
        String s2 = scanner.next();
        super.setColor(s2);

        System.out.print("Input vitaminC: ");
        vitaminC = scanner.nextDouble();
    }

    public static List<Fruit> input(String fileName) {
        List<Fruit> fruitList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String s = null;

            while ((s = br.readLine()) != null) {
                if (s.charAt(0) == 'F') {
                    fruitList.add(Fruit.fromString(s));
                } else {
                    fruitList.add(Citrus.fromString(s));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return fruitList;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public void print(String str) {
        try {
            File file = new File(str);
            Files.writeString(file.toPath(), this.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void print(String fileName, List<Fruit> fruitList) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Fruit fruit : fruitList) {
                bw.write(fruit.toString() + "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Citrus fromString(String s) {
        String nameFruit = null;
        String colorFruit = null;
        double vitaminFruit = 0.0;

        try {
            Pattern p = Pattern.compile("Сitrus\\{name='");
            String str1 = null;
            Matcher m = p.matcher(s);

            while (m.find()) {
                str1 = s.substring(m.end());
            }

            String str2 = null;
            m = Pattern.compile("', color='").matcher(str1);

            while (m.find()) {
                nameFruit = str1.substring(0, m.start());
                str2 = str1.substring(m.end());
            }

            String str3 = null;
            m = Pattern.compile("', vitaminC=").matcher(str2);

            while (m.find()) {
                colorFruit = str2.substring(0, m.start());
                str3 = str2.substring(m.end());
            }

            String vitamin = null;
            m = Pattern.compile("}").matcher(str3);

            while (m.find()) {
                vitamin = str3.substring(0, m.start());
            }

            vitaminFruit = Double.parseDouble(vitamin);

        } catch (Exception ex) {
            //System.err.println(ex);
        }
        return new Citrus(nameFruit, colorFruit, vitaminFruit);
    }

    @Override
    public int compareTo(Fruit o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return "Сitrus{" +
                "name='" + super.getName() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", vitaminC=" + vitaminC +
                '}';
    }
}
