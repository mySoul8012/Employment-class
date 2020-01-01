package com.ming1;

import java.io.*;

public class ObjectInpuStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("2.txt"));
        // 进行反序列化流
        Object object = objectInputStream.readObject();
        // 进行打印
        System.out.println(((Dog)object).getAge());
        objectInputStream.close();
    }
}
