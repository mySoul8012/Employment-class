package com.ming5;

public abstract  class Worker {
    private String name;
    private String gender;
    private int num;
    private double salary;

    public Worker() {
    }

    public Worker(String name, String gender, int num, double salary) {
        this.name = name;
        this.gender = gender;
        this.num = num;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void worker();


}
