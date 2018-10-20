package com.cisco.learning.four.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListsExamples {

    private static final List<String> BOGDANS_CATS = Arrays.asList("Bogdan's cats are great and always calling him".split(" "));

    public static void main(String[] args) {
        arrayList();

        vector();

        linkedList();
    }

    private static void arrayList() {
        List<String> strings = new ArrayList<>();       // the adding order is not guaranteed
        for (String cat : BOGDANS_CATS) {
            strings.add(cat);
        }

        strings.forEach(it -> System.out.println(it));
    }

    // synchronized access list
    private static void vector() {                      // the adding order is not guaranteed
        List<String> strings = new Vector<>();
        strings.add("something");
        strings.add("some");
        strings.forEach(it -> System.out.println(it));

        strings.remove("some");
    }

    private static void linkedList() {
        List<String> words = new LinkedList<>();        // the adding order is guaranteed (by the linked list)
        BOGDANS_CATS.forEach(cat -> words.add(cat));

        words.forEach(word -> System.out.println(word));
    }
}
