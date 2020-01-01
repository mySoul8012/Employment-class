package com.ming3;

import java.io.*;

public class Test06 {
    public static void main(String[] args) throws IOException {
        // 创建输入转换流，用于转换文本编码
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("2.txt"), "UTF-8");
        // 进行文件读取
        int read = inputStreamReader.read();
        // 进行文件输出
        System.out.println(read);
        // 关闭流
        inputStreamReader.close();
    }
}
