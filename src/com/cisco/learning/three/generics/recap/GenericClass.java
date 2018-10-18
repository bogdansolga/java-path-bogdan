package com.cisco.learning.three.generics.recap;

class GenericClass<Type> {
    private Type object;

    GenericClass(Type object) {
        this.object = object;
    }

    void displayObjectDetails() {
        System.out.println("We have created a " + object.getClass().getSimpleName() + " with the value '" + object + "'");
    }
}
