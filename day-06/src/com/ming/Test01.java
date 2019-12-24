package com.ming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test01 {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("xiao", 19));
        studentList.add(new Student("mingf", 18));
        studentList.add(new Student("erfe", 17));
        System.out.println(studentList);
        // 进行按照年龄升序排序
        Collections.sort(studentList);
        // 输出
        System.out.println(studentList);
    }
}
