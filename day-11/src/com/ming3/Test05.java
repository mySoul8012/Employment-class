package com.ming3;

import java.io.*;

public class Test05 {
    public static void main(String[] args) throws IOException {
        // 利用转换流读取不同的文件编码
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("2.txt"), "UTF-8");
        // 进行读取数据
        int ch = inputStreamReader.read();
        // 进行输出
        System.out.println((char)ch);

        // 进行资源释放
        inputStreamReader.close();
    }
}
