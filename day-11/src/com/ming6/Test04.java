package com.ming6;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建打印流
        Scanner scanner = new Scanner(System.in);
        /// 进行文件打印
        String tmp = scanner.nextLine();
        // 进行文件打印
        PrintStream printStream = new PrintStream("33.txt");
        // 进行文件打印
        printStream.println(tmp);
    }
}
