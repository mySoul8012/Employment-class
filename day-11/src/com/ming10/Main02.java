package com.ming10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
    public static void main(String[] args) throws IOException {
        // 定义输入转换流对象
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("test_03.txt"), "GBK");
        // 进行读取
        char[] bytes = new char[1024 * 10];
        // 进行文件读取
        int len = 0;
        // 读取内容，进行打印
        while((len = inputStreamReader.read(bytes)) != -1){
            // 进行打印
            System.out.println(new String(bytes, 0, len));
        }
        // 关闭流
        inputStreamReader.close();
    }
}
