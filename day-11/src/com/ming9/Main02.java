package com.ming9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) throws IOException {
        List<Student> list = new ArrayList<>();
        // 进行读取
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test_02.txt"));
        // 创建 String
        String tmp = null;
        List<Student> list1 = new ArrayList<>();
        // 进行读取
        while((tmp = bufferedReader.readLine()) != null){
            // 进行读取
            String[] tmp1 = tmp.split("=");
            // 进行循环添加
            list1.add(new Student(tmp1[0], tmp1[1], Integer.parseInt(tmp1[2]), tmp1[3]));
        }
        // 关闭流
        bufferedReader.close();
        // 进行读取
        for(Student student:list1){
            // 进行打印
            System.out.println(student);
        }
    }
}
