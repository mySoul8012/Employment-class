package com.ming4;

import java.io.File;

public class Demo2 {
    public static void main(String[] args){
        long lenth = getLength(new File("C:\\Users\\Administrator\\Pictures"));
        // 打印出大小
        System.out.println(lenth);
    }

    // 递归调用大小
    private static long getLength(File file) {
        // 获取长度
        long lenth = 0;
        // 进行递归获取长度
        // 首先判断是否为空 文件是否存在
        if(file != null && file.exists()){
            // 如果文件不为空，再判断是不是文件夹
            if(file.isDirectory()){
                // 如果是文件夹，获取文件列表
                File[] files = file.listFiles();
                // 判断文件夹files是否为空
                if(files == null){
                    return lenth;
                }
                // 如果不为空，进行循环调用
                for(File file1:files){
                    // 进行循环调用
                    lenth += getLength(file1);
                }
            }else{
                // 如果文件夹不为空，进行计算长度
                lenth += file.length();
            }
        }
        // 返回长度
        return lenth;
    }
}
