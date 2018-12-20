package com.cisco.learning.landscape;

public class Tree {

    private String name;
    private double height;
    private String species;
    private boolean hasThorns;

    public Tree(String name, double height, String species, boolean hasThorns) {
        this.name = name;
        this.height = height;
        this.species = species;
        this.hasThorns = hasThorns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isHasThorns() {
        return hasThorns;
    }

    public void setHasThorns(boolean hasThorns) {
        this.hasThorns = hasThorns;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tree{");
        sb.append("name='").append(name).append('\'');
        sb.append(", height=").append(height);
        sb.append(", species='").append(species).append('\'');
        sb.append(", hasThorns=").append(hasThorns);
        sb.append('}');
        return sb.toString();
    }
}
