package com.ming7;

public class Properties {
    private String name;
    private String n1;

    @Override
    public String toString() {
        return "Properties{" +
                "name='" + name + '\'' +
                ", n1='" + n1 + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public Properties(String name, String n1) {
        this.name = name;
        this.n1 = n1;
    }
}
