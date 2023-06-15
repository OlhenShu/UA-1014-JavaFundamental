package homework.lesson5.task5_1.months;

public class Month {
    private int monthIndex;
    private String name;
    private int numbersOfDays;
    public Month(String name, int numbersOfDays, int monthIndex){
        this.monthIndex = monthIndex;
        this.name = name;
        this.numbersOfDays = numbersOfDays;
    }

    public String getName() {
        return name;
    }

    public int getNumbersOfDays() {
        return numbersOfDays;
    }

    public int getMonthIndex() {
        return monthIndex;
    }

    @Override
    public String toString() {
        return "There are " +  numbersOfDays +
                " day/s " + " in " + name;
    }
}
