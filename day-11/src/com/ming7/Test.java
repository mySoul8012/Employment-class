package com.ming7;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // 进行文件输出
        FileWriter fileWriter = new FileWriter("222.txt");
        // 进行文件输出
        fileWriter.write("HelloWorld");
        // 进行关闭
        fileWriter.close();
    }
}
