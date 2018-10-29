package com.cisco.learning.four.collections;

public class Cat implements Comparable<Cat> {

    private final String name;

    private final int age;

    private final String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Cat cat = (Cat) other;

        if (age != cat.age) return false;
        return name != null ? name.equals(cat.name) : cat.name == null;
        // two cats are equal if they have the same age and the same name :)
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Cat other) {
        //return Integer.compare(age, other.age);
        return name.compareTo(other.getName());
    }
}
