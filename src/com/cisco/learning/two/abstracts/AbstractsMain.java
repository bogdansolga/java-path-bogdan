package com.cisco.learning.two.abstracts;

@TrainingSession(
        topic = "abstract classes and interfaces",
        difficulty = "insane (for the moment)"
)
public class AbstractsMain {

    public static void main(String[] args) {
        AbstractProduct first = new Phone("iSomething");
        AbstractProduct second = new Tablet("Niciuna");

        AbstractProduct[] abstractProducts = new AbstractProduct[]{first, second};
        for (AbstractProduct product : abstractProducts) { // for-each
            product.displayName();
        }
    }
}
