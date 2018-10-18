package com.cisco.learning.two.abstracts;

public abstract class AbstractProduct { // cannot be instantiated

    public abstract void displayName(); // all extending classes must implement it

    @SuppressWarnings("unused")
    public void performSomeOperationsDynamically() {
        System.out.println("Doing something:");
        displayName();
        doSomethingElse();
    }

    private void doSomethingElse() {
        System.out.println("Doing stuff");
    }
}
