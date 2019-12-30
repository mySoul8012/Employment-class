package com.ming22;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        // 按照考试成绩
        // 保存学生信息
        list.add(new Student("ming", 23));
        list.add(new Student("ming1", 24));
        list.add(new Student("ming2", 25));
        list.add(new Student("ming3", 26));
        // 按照学生成绩由高到低进行排序
        Collections.sort(list, (Student t1, Student t2) -> {
            return t1.getColor() - t2.getColor();
        });

        // 输出
        for(Student stduentTmp: list){
            System.out.println(stduentTmp);
        }
    }
}
