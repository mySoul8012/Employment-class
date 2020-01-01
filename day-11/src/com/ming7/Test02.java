package com.ming7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties("xiaoxiao", "xiaoxiaoxiao");
        // 进行内容写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("444.txt"));
        // 进行写入
        bufferedWriter.write(properties.toString());
        // 关闭
        bufferedWriter.close();
    }
}
