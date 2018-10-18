package com.cisco.learning.two.abstracts.enums;

public enum WeekDayDecent {

    MONDAY(1), TUESDAY(2);

    private int dayOfTheWeek;

    WeekDayDecent(int dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public int getDayOfTheWeek() {
        return dayOfTheWeek;
    }
}
