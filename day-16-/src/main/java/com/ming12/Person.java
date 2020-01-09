package com.ming12;

public class Person {
    private String name;
    private String sex;
    private int age;
    // 提供公开的get和set方法
    public String getName(){
        // 返回name
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
}
