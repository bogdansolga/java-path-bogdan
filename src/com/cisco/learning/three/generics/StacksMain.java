package com.cisco.learning.three.generics;

import com.cisco.learning.two.abstracts.Cat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StacksMain {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.add("x");

        Stack<Cat> catsStack = new Stack<>();
        catsStack.add(new Cat(10d)); // that's Cisco :)

        Set<Cat> cats = new HashSet<>();        // 'a set _of_ cats'
        List<Cat> moreCats = new ArrayList<>(); // 'a list _of_ cats'
    }
}
