package com.cisco.learning.five;

public class TernaryOperatorExamples {

    public static void main(String[] args) {
        int value = 12;
        int anotherValue = value < 15 ? 20 : 30;

        boolean something = false;
        boolean anotherThing = something ? true : false;

        String some = "some";
        String thing = some.length() > 5 ? "thing" : "thingie";
    }
}
