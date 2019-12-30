package com.ming1;

import java.io.File;

// 进行文件搜索 搜索 C:\Users\Administrator\Desktop\temp\aaa
// 中的 txt 文件
public class RecursionDemo04 {
    public static void main(String[] args){
        String name = "C:\\";
        // 创建文件
        File file = new File(name);
        // 进行文件搜索
        printTxtFiles(file);
    }

    private static void printTxtFiles(File file) {
        // 进行判断是否为空
        if(file == null){
            return;
        }

        // 获取目录数组
        File[] files = file.listFiles();
        // 判断数组是否为空
        if(files == null){
            return;
        }

        // 进行遍历数组
        for(File file1:files){
            // 判断是否为空，为空结束递归
            if(file1 == null){
                // 此时结束递归
                return;
            }


            // 进行遍历
            // 首先判断是否是文件
            if(file1.isFile()){
                // 如果是文件
                // 获取名称，以及后缀名，如果后缀名为 txt结尾，输出
                if(file1.getName().endsWith(".txt")){
                    // 如果是txt结尾的文件，输出数据
                    System.out.println(file1);
                }
            }

            // 判断是否是文件夹
            if(file1.isDirectory()){
                // 此时如果是文件夹
                // 进行递归遍历
                printTxtFiles(file1);
            }
        }
    }
}
