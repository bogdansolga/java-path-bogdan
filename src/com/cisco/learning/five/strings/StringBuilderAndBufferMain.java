package com.cisco.learning.five.strings;

public class StringBuilderAndBufferMain {

    public static void main(String[] args) {
        String first = "The first string";
        String second = "the second one";
        String third = "al 3-lea";

        String all = first + second + third; // OK-ish, for a few strings

        StringBuilder builder = new StringBuilder(); // the recommended way to build / concatenate strings
        builder.append(first).append("something").append(false).append(10).append(23.5)
               .append(second)
               .append(third);
        System.out.println(builder.toString());

        StringBuffer buffer = new StringBuffer(); // same operations, but synchronized (thread safe)
        buffer.append(first);
    }
}
