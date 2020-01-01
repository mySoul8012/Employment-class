package com.ming11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 创建反序列化对象
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ming.txt"));
        // 进行反序列化
        Object o = objectInputStream.readObject();
        // 进行生成
        System.out.println(((Student)o).getSex());
    }
}
