package com.ming;

public class Teacher {
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 吃饭
    public void cifan(){
        System.out.println("吃饭");
    }

    // 睡觉
    public void suijiao(){
        System.out.println("睡觉");
    }

    // 教学
    public void jiaox(){
        System.out.println(this.name + "教学");
    }
}
