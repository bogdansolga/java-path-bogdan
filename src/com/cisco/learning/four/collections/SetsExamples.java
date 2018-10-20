package com.cisco.learning.four.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsExamples {

    private static final List<String> BOGDANS_CATS = Arrays.asList("Bogdan's cats are great and always calling him great".split(" "));

    public static void main(String[] args) {
        hashSet();

        treeSet();

        linkedHashSet();
    }

    private static void hashSet() {
        Set<String> catWords = new HashSet<>();                 // no order is guaranteed
        BOGDANS_CATS.forEach(word -> catWords.add(word));

        catWords.forEach(word -> System.out.println(word));
    }

    private static void treeSet() {
        Set<String> sortedWords = new TreeSet<>();              // the elements are sorted based on their natural sorting or Comparable order
        BOGDANS_CATS.forEach(word -> sortedWords.add(word));

        sortedWords.forEach(word -> System.out.println(word));
    }

    private static void linkedHashSet() {
        Set<String> linkedWords = new LinkedHashSet<>();        // the elements are sorted based on their adding order
        BOGDANS_CATS.forEach(word -> linkedWords.add(word));

        linkedWords.forEach(word -> System.out.println(word));
    }
}
