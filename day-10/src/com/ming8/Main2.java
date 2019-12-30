package com.ming8;

import java.io.File;

public class Main2 {
    public static void main(String[] args){
        pring("C:\\Users");
    }

    private static void pring(String s) {
        // D盘创建一个多级目录，
        // 创建 File 对象
        File file = new File(s);
        // 获取 file 目录下的所有子文件，子目录 file 数组
        File[] files = file.listFiles();
        // 进行判空
        if(files == null){
            // 结束
            System.exit(-1);
        }

        // 进行遍历
        for(File file1:files){
            // 如果是文件，打印 文件 + 绝对路径
            // 判断是否是文件
            if(file1.isFile()){
                // 此时是文件
                // 打印路径
                System.out.println(file1.getAbsoluteFile() + "文件名称 " + file1.getName());
            }

            // 判读是否是目录
            if(file1.isDirectory()){
                // 此时是目录。进行打印
                System.out.println(file1.getAbsoluteFile() + "文件名 " + file1.getName());
                // 进行递归调用
                pring(file1.getAbsolutePath());
            }
        }
    }


}
