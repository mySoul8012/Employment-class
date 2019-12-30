package com.ming8;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 创建 File 对象
        File file = new File("C:\\ming\\ming.txt");
        // 创建file对象
        File file1 = new File("C:\\ming");
        // 创建File对象
        File file2 = new File("C:\\");
        // 判断 file1是否存在
        if(file.exists()){
            // 此时文件存在
            file.createNewFile();
        }
        // 判断 file1 是否存在
        if(file1.exists()){
            file1.mkdir();
        }

        // 判断 file2 是否存在
        if(file2.exists()){
            file2.mkdirs();
        }
    }
}
