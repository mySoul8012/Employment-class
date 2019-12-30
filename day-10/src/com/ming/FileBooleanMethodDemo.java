package com.ming;

import java.io.File;

public class FileBooleanMethodDemo {
    public static void main(String[] args){
        File file = new File("C:\\Users\\Administrator\\Pictures\\34295098.jpg");
        // 判断是否存在
        boolean exists = file.exists();
        // 输出结果
        System.out.println(exists);
        // 判断是否是文件
        boolean isFile = file.isFile();
        // 打印数据
        System.out.println("是文件吗? " + isFile);
        // 判断是否是文件
        boolean isDirectory = file.isDirectory();
        // 打印数据
        System.out.println("是文件吗？" + isDirectory);
    }
}
