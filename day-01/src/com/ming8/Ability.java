package com.ming8;

public class Ability {
    private String name;
    private double multiple;
    private int mpConsume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMultiple() {
        return multiple;
    }

    public void setMultiple(double multiple) {
        this.multiple = multiple;
    }

    public int getMpConsume() {
        return mpConsume;
    }

    public void setMpConsume(int mpConsume) {
        this.mpConsume = mpConsume;
    }

    public Ability(String name, double multiple, int mpConsume) {
        this.name = name;
        this.multiple = multiple;
        this.mpConsume = mpConsume;
    }

}
