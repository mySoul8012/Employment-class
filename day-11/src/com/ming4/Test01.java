package com.ming4;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test01 {
    public static void main(String[] args) throws IOException {
        // 进行文件输出
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C:\\ming\\ming.txt"));
        // 进行数据写入
        bufferedOutputStream.write(3);
        // 关闭流
        bufferedOutputStream.close();

    }
}
