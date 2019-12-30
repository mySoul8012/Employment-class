package com.ming8;

import java.io.File;

public class Test {
    public static void main(String[] args){
        File file = new File("C:\\ming\\ming.txt");
        File file1 = new File("C:\\ming");
        // 获取 file1 的绝对路径
        // 获取 file1 的绝对路径
        System.out.println(file.getAbsoluteFile());
        // 获取 file2 的绝对路径
        System.out.println(file.getAbsoluteFile());
        // 获取file1的文件名
        System.out.println(file.getName());
        // 获取file2的文件名
        System.out.println(file1.getName());
        // 获取目录名
        System.out.println(file.getParent());
        // 获取file2的目录名
        System.out.println(file1.getParent());
        // 获取 file1的大小
        System.out.println(file1.length());
        // 获取 file2的大小
        System.out.println(file.length());
        // 判断是否存在
        System.out.println(file.exists());
        // 判断file2是否存在
        System.out.println(file1.exists());
        // 获取file1的大小
        System.out.println(file.length());
        // 获取file大小
        System.out.println(file1.length());
        // 判断 file1 是否是文件
        System.out.println(file.isFile());
        System.out.println(file1.isDirectory());


    }
}
