package com.cisco.learning.six;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nExamples {
    public static void main(String[] args) {
        Locale english = new Locale("en", "US");
        // loading is done just once, when the program starts
        ResourceBundle englishResourceBundle = ResourceBundle.getBundle("messages", english);

        // getting the values is done whenever it's needed
        System.out.println(englishResourceBundle.getString("greeting"));

        Locale ro = new Locale("ro", "RO");
        ResourceBundle romanian = ResourceBundle.getBundle("messages", ro);
        System.out.println(romanian.getString("greeting"));

        Locale french = new Locale("fr", "FR");
        ResourceBundle frenchRB = ResourceBundle.getBundle("messages", french);
        System.out.println(frenchRB.getString("greeting"));
    }
}
