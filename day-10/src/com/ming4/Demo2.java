package com.ming4;

import java.io.File;

public class Demo2 {
    public static void main(String[] args){
        long lenth = getLength(new File("C://Users"));
        // 打印出大小
        System.out.println(lenth);
    }

    public static long getLength(File file){
        long lenth = 0;
        // 递归计算文件夹中的所有文件，及其子文件的大小
        // 首先判断文件是否存在
        if(file.exists() && file != null){
            // 如果文件存在，并且传入的不为空，进行递归计算总大小
            // 判断文件夹是否存在  如果传入的是文件夹，进行递归调用
            if(file.isDirectory()){
                File[] files = file.listFiles();
                // 判断获取的文件列表是否为空
                if(files != null){
                    return lenth;
                }
                for(File file1:files){
                    // 递归调用方法
                    lenth += getLength(file1);
                }
            }else{
                // 如果不是文件夹，进行计算
                lenth += file.length();
            }
        }
        // 返回lneth
        return lenth;
    }
}
