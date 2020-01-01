package com.ming2;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建打印流
        PrintStream printStream = new PrintStream("2.txt");
        // 进行打印
        printStream.println("3444");
        printStream.println("2222");
        printStream.println("222");
        // 关闭资源
        printStream.close();
    }
}
