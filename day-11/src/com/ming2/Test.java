package com.ming2;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        // 进行修改打印流向
        // 创建打印流向
        PrintStream printStream = new PrintStream("2.txt");
        // 修改打印流向
        System.setOut(printStream);
        // 进行打印
        System.out.println("3333");
        System.out.println("222");
    }
}
