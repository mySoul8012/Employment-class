package com.ming;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    * 正数  当前对象大于参数对象，sort当前对象放在参数对象后面
    * 负数   当前对象小于参数对象，sort放在参数对象前面
    * 0  当前对象等于参数对象，sort 不会进行排序
    * */
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;  // 升序
    }
}
