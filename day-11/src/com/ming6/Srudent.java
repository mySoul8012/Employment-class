package com.ming6;

import java.io.Serializable;

public class Srudent implements Serializable {
    private String name;
    private int age;
    private String sex;
    private static final long serialversionUID = 1L;



    public static long getSerialversionUID() {
        return serialversionUID;
    }

    @Override
    public String toString() {
        return "Srudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Srudent(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
