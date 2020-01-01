package com.ming1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // 创建一个序列化流对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("2.txt"));
        // 创建对象
        Dog dog = new Dog(2, "对象");
        // 写入对象
        objectOutputStream.writeObject(dog);
        // 进行资源释放
        objectOutputStream.close();
    }
}
