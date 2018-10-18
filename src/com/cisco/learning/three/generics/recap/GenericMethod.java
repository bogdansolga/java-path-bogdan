package com.cisco.learning.three.generics.recap;

public class GenericMethod {

    public static <Type> void displayType(Type type) {
        System.out.println("We have a " + type.getClass().getSimpleName());
    }

    public static <First, Second> void multipleTypes(First first, Second second) {
        System.out.println("The first type is '" + first.getClass().getSimpleName() +
                "', the second type is '" + second.getClass().getSimpleName() + "'");
    }
}
