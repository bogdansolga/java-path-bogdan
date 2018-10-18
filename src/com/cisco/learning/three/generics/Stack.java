package com.cisco.learning.three.generics;

// Stack is a generic class - it can be used for any specific type
public class Stack<Type> {

    public void add(Type type) {
        System.out.println("Adding type " + type);
    }

    public void addString(String string) {
        System.out.println("Adding the string " + string);
    }

    public void remove(Type type) {
        System.out.println("Removing " + type);
    }
}
