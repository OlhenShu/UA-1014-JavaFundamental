package lesson12.practical;

public class PlantDemo {
    public static void main(String[] args) {
        try {
            Plant[] plants = new Plant[5];
            plants[0] = new Plant(10, Color.RED, Type.FLOWER);
            plants[1] = new Plant(8, Color.GREEN, Type.TREE);
            plants[2] = new Plant(6, Color.BLUE, Type.SHRUB);
            /* plants[3] = new Plant(12, Color.YELLOW, Type.TREE);
            Invalid color*/
            /*plants[4] = new Plant(5, Color.RED, Type.BUSH);
            Invalid type*/


            for (Plant plant : plants) {
                System.out.println(plant);
            }
        } catch (ColorException | TypeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
