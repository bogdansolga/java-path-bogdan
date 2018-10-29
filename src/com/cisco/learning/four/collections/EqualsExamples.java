package com.cisco.learning.four.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EqualsExamples {

    public static void main(String[] args) {
        Cat cisco       = new Cat("Cisco",  3, "grey");
        Cat diva        = new Cat("Diva",   2, "white");
        Cat ciscoClone  = new Cat("Cisco",  3, "white-ish");

        System.out.println(cisco.equals(ciscoClone));

        Set<Cat> cats = new HashSet<>(3);
        cats.add(cisco);
        cats.add(diva);
        cats.add(ciscoClone);

        System.out.println("We have " + cats.size() + " cats"); // 2 or 3?

        System.out.println("--------------------------------------------------");

        Map<Cat, String> bogdanAttachment = new HashMap<>();
        bogdanAttachment.put(cisco, "Highest");
        bogdanAttachment.put(diva, "Moderate");
        bogdanAttachment.put(ciscoClone, "Pretty high");

        System.out.println("We have " + bogdanAttachment.size() + " entries in our map");
        bogdanAttachment.forEach((key, value) -> System.out.println("\t" + key.getName() + " -> " + value));

        //how many entries do we have in the map?
    }
}
