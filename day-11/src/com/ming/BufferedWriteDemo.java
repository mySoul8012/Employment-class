package com.ming;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteDemo {
    public static void main(String[] args) throws IOException {
        // 创建缓冲字符输入流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-11\\src\\1.properties"));
        // 进行数据写入
        for(int i = 0; i < 10; i++){
            // 进行数据写入
            bufferedWriter.write((char)i);
            bufferedWriter.write(344);
            bufferedWriter.newLine();
        }

        // 对资源进行释放
        bufferedWriter.close();
    }
}
