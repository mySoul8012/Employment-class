package com.ming5;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Student> students = new ArrayList<Student>();

        // 生成学生对象
        Student student = null;
        for(int i = 0; i < 3; i++){
            student.setSex(i + "");
            student.setName(i + "222");
            student.setAge(i + "34324");
            // 保存进入集合中
            students.add(i, student);
        }
        // 打印集合
        System.out.println(students);
    }
}
