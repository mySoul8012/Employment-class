package com.ming8;

import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("2.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("222.txt"));
        // 进行文件复制
        int len = 0;
        byte[] bytes = new byte[1024 * 10];
        // 进行复制
        while((len = bufferedInputStream.read(bytes)) != -1){
            // 进行复制
            bufferedOutputStream.write(bytes, 0, len);
        }
        // 关闭流。进行持久化保存
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
