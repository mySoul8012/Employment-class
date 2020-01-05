package com.ming1;

public class Cat {
    private String name;
    private String age;

    public void eat(String name, String age){
        System.out.println(name + " "  + age);
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Cat() {
    }
}
