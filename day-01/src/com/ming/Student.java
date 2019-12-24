package com.ming;

public class Student {
    private String name;
    private String sex;
    private String age;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
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

    // 学习
    public void xxing(){
        System.out.println(this.name + "正在学习Java");
    }




}
