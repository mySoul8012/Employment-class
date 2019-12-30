package com.ming;

import java.io.File;

public class FileGetMethodDemo {
    public static void main(String[] args){
        File f1 = new File("C:\\Users\\Administrator\\Pictures");
        // 获取文件名
        String name = f1.getName();
        // 打印数据
        System.out.println(name);
        // 获取绝对路径
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);
        // 获取绝对路径
        String path = f1.getPath();
        // 打印数据
        System.out.println(path);
        // 获取数据
        long len = f1.length();
        System.out.println(len);
    }
}
