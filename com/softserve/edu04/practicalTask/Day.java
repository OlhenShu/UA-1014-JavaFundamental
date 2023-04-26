package com.softserve.edu04.practicalTask;

public enum Day {
    SUNDAY("неділя", "sunday"),
    MONDAY("понеділок", "monday"),
    TUESDAY("вівторок", "tuesday"),
    WEDNESDAY("середа", "wednesday"),
    THURSDAY("четвер", "thursday"),
    FRIDAY("п'ятниця", "friday"),
    SATURDAY("субота", "saturday");

    private final String UK;
    private final String EN;

    Day(String uk, String en) {
        this.UK = uk;
        this.EN = en;
    }

    public String getUk() {
        return UK;
    }

    public String getEn() {
        return EN;
    }
}
