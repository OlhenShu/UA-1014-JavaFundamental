package org.example;

import java.util.Arrays;

class Main1 {

}

class A implements Comparable {
    String[] name;

    public A(String name) {
        this.name = new String[] {name};
    }

  public String getName() {
        return name[0];
  }

    public void setName(String name) {
        this.name[0] = name;
    }

    @Override
    protected A clone() {
        try {
            var res = (A) super.clone();
            res.name = res.name.clone();
            return res;
        catch(CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
            A a = new A("Alice");
            A b = a.clone();
            System.out.println(b.getName());
            a.setName("Bob");
            System.out.println(a.getName());
            System.out.println(b.getName());
    }
}