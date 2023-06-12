package practical.lessonTwelve.task2;

import practical.lessonTwelve.task2.Plant.Color;
import practical.lessonTwelve.task2.Plant.Type;

public class Task2 {
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];
        
        try {
            plants[0] = new Plant(3, Type.TREE, Color.GREEN);
            plants[1] = new Plant(7, Type.FLOWER, Color.GREEN);
            plants[2] = new Plant(8, Type.SHRUB, Color.GREEN);
            plants[3] = new Plant(2, null, Color.GREEN);
            plants[4] = new Plant(4, Type.TREE, null);
        } catch (TypeException | ColorException | SizeException e) {
            System.out.println(e.getMessage());
        }

        for (Plant plant : plants) {
            if (plant != null) System.out.println(plant);
        }
    }
}
