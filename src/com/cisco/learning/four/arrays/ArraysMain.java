package com.cisco.learning.four.arrays;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {
        // 1st init mode - initialize all values
        int[] firstArray = new int[]{10, 5, 7};
        for (int value : firstArray) { // int -> Integer: boxing, Integer -> int: unboxing
            System.out.println(value);
        }

        System.out.println("------------------------------");

        // 2nd init mode - initialize just the size --> all the entries are set to 0 [for int]
        int[] secondArray = new int[5];
        secondArray[2] = 5;
        secondArray[4] = 9;
        for (int value : secondArray) {
            System.out.println(value);
        }

        System.out.println("------------------------------");

        boolean[] values = new boolean[3];
        System.out.println(Arrays.toString(values));

        System.out.println("------------------------------");

        // the lazy String array building way
        String[] myFavoriteString = "I want a holiday, not just a weekend :)".split("\\s"); // \\s = white-space
        System.out.println(myFavoriteString.length + ", " + Arrays.toString(myFavoriteString));

        // the non lazy String array build way
        String[] nonLazyArray = new String[]{"some", "values", "in", "this", "array"};
        System.out.println(Arrays.toString(nonLazyArray));

        // the Arrays class contains a lot of arrays operations
        final int[] newArray = Arrays.copyOfRange(secondArray, 2, 4);
        for (int i : newArray) {
            System.out.println(i);
        }
    }
}
