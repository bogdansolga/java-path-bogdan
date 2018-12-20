package com.cisco.learning.landscape;

public class Lake {

    private String name;
    private int depth;
    private String color;
    private int blueLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBlueLevel() {
        return blueLevel;
    }

    public void setBlueLevel(int blueLevel) {
        this.blueLevel = blueLevel;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Lake{");
        sb.append("name='").append(name).append('\'');
        sb.append(", depth=").append(depth);
        sb.append(", color='").append(color).append('\'');
        sb.append(", blueLevel=").append(blueLevel);
        sb.append('}');
        return sb.toString();
    }
}
