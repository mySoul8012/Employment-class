package com.ming14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // 创建集合
        List<Student> list = new ArrayList<>();
        // 进行添加
        list.add(new Student("张三", "蓝", 20, "988"));

        // 进行添加
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\ming\\ming.txt");
        // 进行遍历添加
        for(Student student:list){
            // 进行循环遍历添加
            fileOutputStream.write(student.toString().getBytes());
            fileOutputStream.write("\n".getBytes());
        }

        // 进行输出结束
        System.out.println("结束");
    }
}
