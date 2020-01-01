package com.ming11;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建一个对象
        Student student = new Student("xiaoxiao", "xiaoxiao", "10");
        // 定义序列化对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("ming.txt"));
        // 进行序列化
        objectOutputStream.writeObject(student);
        // 关闭流
        objectOutputStream.close();

    }
}
