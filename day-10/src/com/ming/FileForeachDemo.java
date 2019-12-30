package com.ming;

import java.io.File;

public class FileForeachDemo {
    public static void main(String[] args){
        // 创建File对象，必须代表文件夹
        File file = new File("C");
        // 遍历名字
        String[] fileNames = file.list();
        for(String fileName:fileNames){
            System.out.println(fileName);
        }
        // 遍历file对象
        File[] files = file.listFiles();
        for(File file1:files){
            System.out.println(file1);
            System.out.println("是文件夹吗？" + file.isDirectory());
            System.out.println("是文件吗 ？ " + file.isFile());
        }

    }
}
