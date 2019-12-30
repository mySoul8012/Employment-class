package com.ming4;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args)throws IOException {
        // 传入文件名，输出结果
        show("C:\\Users\\Administrator\\Pictures\\20191225111.png");
    }

    public static void show(String path) throws IOException {
        // 创建文件
        File file = new File(path);
        // 判断文件是否存在
        if(file.exists()){
            // 如果文件不存在 创建文件
            file.createNewFile();
        }
        // 调用文件api获取文件名
        String name = file.getName();
        System.out.println(name);
        // 输出绝对路径名
        String abstorPath = file.getAbsolutePath();
        System.out.println(abstorPath);
        // 获取父文件
        String fileParth = file.getParent();
        System.out.println(fileParth);
        // 获取文件大小
        long lenth = file.length();
        System.out.println(lenth);
        // 获取文件后缀名
        String str = file.getName().substring(file.getName().lastIndexOf("."));
        System.out.println(str);
    }


}
