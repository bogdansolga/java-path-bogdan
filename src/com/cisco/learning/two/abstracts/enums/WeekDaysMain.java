package com.cisco.learning.two.abstracts.enums;

public class WeekDaysMain {

    public static void main(String[] args) {
        WeekDayDecent monday = WeekDayDecent.MONDAY;
        System.out.println(monday.getDayOfTheWeek());

        // dynamic instantiation
        WeekDayHipster dynamic = WeekDayHipster.valueOf("TUESDAY");
        System.out.println(dynamic);
    }
}
