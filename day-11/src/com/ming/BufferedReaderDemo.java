package com.ming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        // 创建BufferReader对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-11\\src\\1.properties"));
        // 进行读取数据
        String line = null;
        // 进行数据读取
        while((line = bufferedReader.readLine()) != null){
            // 不等于 Null 继续执行
            System.out.println(line);
        }
        // 资源释放
        bufferedReader.close();
        // 输出结束
        System.out.println("结束");
    }
}
