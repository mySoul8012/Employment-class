package com.ming22;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Person> list1 = new ArrayList<>();
        ArrayList<Student> list2 = new ArrayList<>();
        ArrayList<JavaStudent> list3 = new ArrayList<>();
        ArrayList<UIStudent> list4 = new ArrayList<>();
        ArrayList<Teacher> list5 = new ArrayList<>();
        ArrayList<JavaTeacher> list6 = new ArrayList<>();
        ArrayList<UITeacher> list7 = new ArrayList<>();

    }

    // 参数可以接收任何泛型的ArrayLis参数
    public static void peint1(ArrayList<?> list){

    }

    // 参数可以接收任何Person及其子类泛型的ArrayLis参数
    public static void print2(ArrayList<? extends Person> list){

    }

    // 参数可以接收任何 Student 及其子类泛型的 ArrayList 参数
    public static void print3(ArrayList<? extends Student> list){

    }

    // 参数可以接收任何 Java 学员，及其父类泛型ArrayList参数
    public static void print4(ArrayList<? super JavaStudent> list){

    }
}
