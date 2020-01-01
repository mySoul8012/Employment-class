package com.ming1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException {
        readObject();
    }


    public static void readObject() throws IOException {
        // 创建一个序列化流
        List<Dog> list = new ArrayList<>();
        // 添加集合
        list.add(new Dog(23, "xiao"));
        list.add(new Dog(34, "ming"));
        list.add(new Dog(12, "xiaoming"));
        // 进行序列化流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("2.txt"));
        // 进行序列化
        objectOutputStream.writeObject(list);
        // 进行资源释放
        objectOutputStream.close();
    }
}
