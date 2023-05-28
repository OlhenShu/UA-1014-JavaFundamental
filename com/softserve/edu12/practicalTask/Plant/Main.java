package com.softserve.edu12.practicalTask.Plant;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            Plant[] plants = {
                    new Plant("flower", "red", 5),
                    new Plant("wood", "blue", 8),
                    new Plant("shrub", "blue", 5),
            };
            System.out.println(Arrays.toString(plants));
        } catch (TypeException | ColorException | SizeException e) {
            System.err.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}
