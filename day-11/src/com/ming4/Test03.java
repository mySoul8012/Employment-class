package com.ming4;

import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException {
        // 使用高效字节流，输入文件
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("2.txt"));
        // 进行文件读入
        bufferedWriter.write("I LOve Java");
        // 关闭流
        bufferedWriter.close();
        // 输出结果
        System.out.println("输出结束");
    }
}
