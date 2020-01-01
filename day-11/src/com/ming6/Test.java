package com.ming6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Srudent> list = new ArrayList<>();
        // 进行添加
        list.add(new Srudent("ming", 23, "蓝"));
        list.add(new Srudent("xiaoming", 45, "男"));
        // 创建写入流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("33.txt"));
        // 对流进行写入
        objectOutputStream.writeObject(list);
        // 关闭流
        objectOutputStream.close();
    }
}
