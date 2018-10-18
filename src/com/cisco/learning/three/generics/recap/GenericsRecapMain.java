package com.cisco.learning.three.generics.recap;

public class GenericsRecapMain {

    public static void main(String[] args) {
        GenericClass<String> stringObject = new GenericClass<>("something");
        stringObject.displayObjectDetails();

        GenericClass<Integer> integerObject = new GenericClass<>(20);
        integerObject.displayObjectDetails();

        GenericClass<Boolean> booleanObject = new GenericClass<>(true);
        booleanObject.displayObjectDetails();

        System.out.println("---------------------------------------------------------------------");

        GenericMethod.displayType("something");
        GenericMethod.displayType(23);
        GenericMethod.displayType(false);

        GenericMethod.multipleTypes(23, "second");
    }
}
