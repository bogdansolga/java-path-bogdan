package com.cisco.learning.three.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodsMain {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Cisco");
        strings.add("Diva");

        List<Integer> days = new ArrayList<>();
        days.add(10);
        days.add(30);

        displayItems(strings, 1);   // T becomes String
        displayItems(days, 0);      // T becomes Integer

        List<String> holidayWish = Arrays.asList("I want a holiday, not just a weekend".split(" "));
        for (String wish : holidayWish) {
            System.out.println(wish);
        }
    }

    private static <T> void displayItems(List<T> elements, int until) {
        for (int i = 0; i < until; i++) { // bătrânescul for, aka good old for :)
            System.out.println(elements.get(i));
        }
    }
}
