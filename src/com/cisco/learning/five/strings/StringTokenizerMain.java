package com.cisco.learning.five.strings;

import java.util.StringTokenizer;

public class StringTokenizerMain {

    public static void main(String[] args) {
        String bogdansCats = "Bogdan has a lot of nice and loving cats: he plays with them every day, brings them little mice; and some pizza";

        StringTokenizer stringTokenizer = new StringTokenizer(bogdansCats, ",:;");
        while (stringTokenizer.hasMoreElements()) {
            String element = stringTokenizer.nextToken();
            System.out.println("The token is: " + element);
        }
    }
}
