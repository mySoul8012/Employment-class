package com.ming5;

import java.io.*;

public class Test02 {
    public static void main(String[] args) throws IOException {
        // 创建流。进行读取
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("333.txt"), "GBK");
        // 进行读取
        int len = 0;
        char[] tmp = new char[1024];
        // 进行读取
        while((len = inputStreamReader.read(tmp)) != -1){
            // 进行文件读取
            System.out.println(new String(tmp, 0 , len));
        }
    }
}
