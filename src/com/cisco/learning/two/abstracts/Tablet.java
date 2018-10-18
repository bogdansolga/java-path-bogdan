package com.cisco.learning.two.abstracts;

public class Tablet extends AbstractProduct {
    private final String name;

    public Tablet(String name) {
        this.name = name;
    }

    @Override
    public void displayName() {
        System.out.println("The tablet is '" + name + "'");
    }
}
