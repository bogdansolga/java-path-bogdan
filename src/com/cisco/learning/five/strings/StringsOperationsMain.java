package com.cisco.learning.five.strings;

public class StringsOperationsMain {

    public static void main(String[] args) {
        String aStringExample = "we don't have enough inspiration now :)";

        // the String objects are immutable --> we cannot operate on them, we must _always_ create new objects
        aStringExample.substring(4, 7); // aStringExample won't be altered, a new value is always returned

        // string operations
        String from5ToTheEnd = aStringExample.substring(5);
        String from3To7 = aStringExample.substring(3, 7);
        String from3To5 = aStringExample.substring(3, 5);
        System.out.println("Our values are: '" + from5ToTheEnd + "', '" + from3To7 + "', '" + from3To5 + "'");

        String upperCased = aStringExample.toUpperCase();
        System.out.println(upperCased);

        System.out.println(aStringExample.length());

        String[] parts = aStringExample.split(" ");
        for (String part : parts) {
            //System.out.println(part);
        }

        boolean enough = aStringExample.contains("enough");
        int have = aStringExample.indexOf("have");  // if the string is not found, the method will return -1
        System.out.println("The index of have is " + have);

        int lastIndexOfx = aStringExample.lastIndexOf("x");
        System.out.println("x appears on the last position on " + lastIndexOfx);

        String replace = aStringExample.replace("have", "haven't");
        System.out.println(replace);

        String trim = " Ana are mere    ".trim();
        System.out.println("Ana, trimmed: '" + trim + "'");
    }
}
