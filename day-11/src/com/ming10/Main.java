package com.ming10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        // 创建输出转换流对象
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("test_03.txt"), "GBK");
        // 进行文件输出
        outputStreamWriter.write("mingming");
        // 关闭流
        outputStreamWriter.close();
    }
}
