package com.ming3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\ming\\ming.txt"));
        byte[] b = new byte[1];
        int len = 0;
        // 进行读取
        while((len = bufferedInputStream.read(b)) != -1){
            // 生成字符串和
            System.out.println(new String(b));
        }
    }
}
