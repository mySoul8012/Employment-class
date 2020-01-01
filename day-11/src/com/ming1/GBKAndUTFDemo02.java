package com.ming1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class GBKAndUTFDemo02 {
    public static void main(String[] args) throws IOException {
        // 进行文件读取
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\ming\\ming.txt"), "UTF-8");
        // 进行读数据
        int ch = inputStreamReader.read();
        // 打印
        System.out.println(ch);
        // 释放
        inputStreamReader.close();
    }
}
