package com.ming6;

import java.io.*;
import java.util.List;

// 进行文件读取
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 创建输入流
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("33.txt"));
        // 进行读取
        List<Srudent> list = (List<Srudent>) objectInputStream.readObject();
        // 进行数据输出
        for(Srudent stu:list){
            System.out.println(stu);
        }

    }
}
