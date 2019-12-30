package com.ming1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Pictures\\34295098.txt");
        // 向文件中写数据
        fileOutputStream.write(3);

        // 写入数组
        byte[] bytest = new byte[1024 * 10];
        // 添加数据
        for(int i = 0; i < bytest.length ; i++){
            bytest[i] = (byte) i;
        }

        // 写入数据
        fileOutputStream.write(bytest);


    }
}
