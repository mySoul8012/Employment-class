package com.ming14;

public class Student {
    private String name;
    private String sex;
    private int age;
    private String fenshu;

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

    public String getFenshu() {
        return fenshu;
    }

    public void setFenshu(String fenshu) {
        this.fenshu = fenshu;
    }

    public Student(String name, String sex, int age, String fenshu) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.fenshu = fenshu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", fenshu='" + fenshu + '\'' +
                '}';
    }
}
