package com.ming12;

import java.util.Objects;

public class Student {
    private String num;
    private String name;
    private double score;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Double.compare(student.getScore(), getScore()) == 0 &&
                Objects.equals(getNum(), student.getNum()) &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNum(), getName(), getScore());
    }

    public Student() {
    }

    public Student(String num, String name, double score) {
        this.num = num;
        this.name = name;
        this.score = score;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
