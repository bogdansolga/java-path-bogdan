package com.cisco.learning.landscape;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Landscape {

    private String name;

    private List<Tree> trees;

    private Set<Lake> lakes;

    public Landscape() {
        trees = new ArrayList<>();
        lakes = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tree> getTrees() {
        return trees;
    }

    public void setTrees(List<Tree> trees) {
        this.trees = trees;
    }

    public Set<Lake> getLakes() {
        return lakes;
    }

    public void setLakes(Set<Lake> lakes) {
        this.lakes = lakes;
    }

    public void addLake(Lake lake) {
        lakes.add(lake);
    }

    // other elements in the landscape

    public void displayLandscapeProperties() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("The landscape '").append(name).append("' contains ");
        stringBuffer.append(trees.size()).append(" trees");
        stringBuffer.append(" and ").append(lakes.size()).append(" lakes");

        System.out.println(stringBuffer);

        System.out.println("\tThe lakes are:");
        lakes.forEach(lake -> System.out.println("\t\t" + lake));

        System.out.println("\tThe trees are:");
        trees.forEach(tree -> System.out.println("\t\t" + tree));
    }
}
