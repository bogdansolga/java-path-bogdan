package com.cisco.learning.two.abstracts;

public class FancyPhone extends Phone {

    public FancyPhone(String name) {
        // 'super' always refers to the super (parent) class

        super(name);

        displayName();
        super.displayName();
        this.displayName();
    }

    // overriding a method
    @Override
    public void displayName() {
        System.out.println("Displaying the fancy tablet...");
    }

    //overloading a method
    public void displayName(String name) {
        System.out.println("The name is '" + name + "'");
    }
}
