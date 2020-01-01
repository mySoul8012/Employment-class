package com.ming9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) throws IOException {
        // 创建流
        List<Student> list = new ArrayList<Student>();
        // 添加数据
        list.add(new Student("ming", "xoa",23, "444"));
        list.add(new Student("xiaoxiao", "xiaoxiao", 34, "xaoixoa"));
        // 定义字符缓冲流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test_02.txt"));
        // 进行写入
        String tmp = null;
        for(Student tmp1:list){
            bufferedWriter.write(tmp1.toString());
            bufferedWriter.newLine();
        }
        // 关闭流
        bufferedWriter.close();
    }
}
