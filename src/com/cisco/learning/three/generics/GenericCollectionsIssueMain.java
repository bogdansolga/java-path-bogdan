package com.cisco.learning.three.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericCollectionsIssueMain {

    public static void main(String[] args) {
        theProblem();

        theSolution();
    }

    private static void theSolution() {
        // 'a List of strings'
        List<String> strings = new ArrayList<>(); // typed object
        strings.add("something");
        strings.add("5"); // compilation error

        Set<Integer> integers = new HashSet<>();
        integers.add(6);
    }

    private static void theProblem() {
        // once upon a time, there was Java 1.4 :)
        // in Java 1.4, we had no types for collection items:
        List list = new ArrayList();
        list.add("a string");
        list.add(5);
        list.add(Boolean.TRUE);
        list.add("some random mâță");
        // --> the list is non typed, we can add any object types in it

        for (Object object : list) {
            // dear 'object' - what are you?, aka 'dude... wtf?'
            System.out.println(object.getClass().getSimpleName());
        }
    }
}
