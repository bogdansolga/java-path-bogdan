package com.cisco.learning.four.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ComparableExamples {

    public static void main(String[] args) {
        Cat cisco       = new Cat("Cisco",  3, "grey");
        Cat diva        = new Cat("Diva",   2, "white");
        Cat ciscoClone  = new Cat("AnotherCisco",  5, "white-ish");

        // 1 - using a sorted collection type
        TreeSet<Cat> cats = new TreeSet<>();
        cats.add(ciscoClone);
        cats.add(diva);
        cats.add(cisco);

        //cats.forEach(cat -> System.out.println(cat.getName()));

        System.out.println("--------------------------------------------------");

        // 2 - using an unsorted collection type
        List<Cat> unsortedCats = new ArrayList<>();
        unsortedCats.add(diva);
        unsortedCats.add(ciscoClone);
        unsortedCats.add(cisco);
        unsortedCats.forEach(cat -> System.out.println(cat.getName() + " -> " + cat.getAge()));

        Collections.sort(unsortedCats);

        System.out.println("\nAfter sorting the elements:");
        unsortedCats.forEach(cat -> System.out.println(cat.getName() + " -> " + cat.getAge()));

        unsortedCats.sort(Comparator.comparing(Cat::getName));
    }
}
