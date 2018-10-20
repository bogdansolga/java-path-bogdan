package com.cisco.learning.four.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsShowcase {

    public static void main(String[] args) {
        lists();

        sets();

        maps();
    }

    private static void lists() {
        // creating a collection
        List<String> strings = new ArrayList<>();

        // collections operations --> CRUD (Create, Read, Update, Delete)

        // 1 - adding [0 index based]
        strings.add("Cisco");
        strings.add("Diva");
        strings.add("Diva"); // the List collection can contain the same element multiple times

        // 2 - obtaining
        System.out.println("The element on the position 1 is '" + strings.get(1) + "'");

        // 3 - removing
        System.out.println("We have removed the element '" + strings.remove(0) + "'");

        // 4 - iterating
        iterationModes(strings);

        System.out.println("The size of the list is " + strings.size());
    }

    private static void iterationModes(List<String> strings) {
        // iteration modes
        // 1 - Java 8+ / functional mode
        strings.forEach(item -> System.out.println(item));

        // 2 - Java 6+ / imperative mode
        for (String string : strings) {
            System.out.println(string);
        }

        // 3 - index based / the good ol' 'for'
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        // 4 - iterating using an Iterator
        Iterator<String> stringIterator = strings.iterator(); // the only way to remove items while iterating over the collection
        while (stringIterator.hasNext()) {
            String next = stringIterator.next();
            System.out.println(next);
        }
    }

    private static void sets() {
        Set<Integer> integers = new HashSet<>(3);
        integers.add(5);
        integers.add(10);
        integers.add(10); // the Set collection does not contain multiple elements of the same type

        integers.forEach(item -> System.out.println(item));

        // the same CRUD operations are available
        System.out.println(integers.remove(2));

        System.out.println(integers.size());

        System.out.println(integers.contains(10));
    }

    private static void maps() {
        Map<String, Integer> map = new HashMap<>(2);

        // the keys _must_ be distinct; if we add the same key-value twice, the existing one will be replaced
        map.put("Cisco", 5); // coolness
        map.put("Diva", 4);
        map.put("The other Diva", 4);

        final Integer coolnessOfDiva = map.remove("Diva");
        System.out.println("The coolness of Diva was " + coolnessOfDiva);

        final Set<String> strings = map.keySet();
        strings.forEach(it -> System.out.println(it));

        final Collection<Integer> values = map.values();
        values.forEach(item -> System.out.println(item));
    }
}
