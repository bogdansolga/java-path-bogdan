package com.cisco.learning.two.abstracts;

public class Phone extends AbstractProduct {
    private final String name;

    public Phone(String name) {
        this.name = name;
    }

    @Override
    public void displayName() {
        System.out.println("The phone is '" + name + "'");
    }
}
