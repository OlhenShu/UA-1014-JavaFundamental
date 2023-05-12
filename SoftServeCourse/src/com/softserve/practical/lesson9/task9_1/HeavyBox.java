package practical.lesson9.task9_1;

public class HeavyBox {
    private int weight;
    private String contents;
    public HeavyBox(int weight,String contents){
        this.weight = weight;
        this.contents = contents;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return  "Box weight - " + weight
                + ",contents - " + contents;
    }
}
