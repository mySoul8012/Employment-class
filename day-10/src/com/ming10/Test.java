package com.ming10;

import java.io.File;

// 使用递归遍历多级目录，打印所有文件的绝对路径
public class Test {
    public static void main(String[] args){
        // 打印多级目录
        // 获取目录
        File file = new File("C:\\Users");
        // 进行打印
        pring(file);
    }

    private static void pring(File file) {
        // 进行递归调用输出
        if(file == null){
            // 如果为空，进行返回
            return;
        }
        // 如果不为空继续
        // 获取文件数组
        File[] files = file.listFiles();
        // 判断是否为空
        if(files == null){
            // 此时为空，进行返回
            return;
        }
        // 进行遍历文件
        for(File file1:files){
            // 进行遍历
            // 判断文件是否为空
            if(file1.exists() && file1 == null){
                // 如果为空，进行返回
                return;
            }
            // 如果不为空，进行继续
            if(file1.isDirectory()){
                // 此时为文件
                // 进行输出
                pring(file1);
            }
            // 如果为文件，输出绝对路径
            if(file1.isFile()){
                // 输出路径
                System.out.println(file1.getAbsoluteFile());
            }
        }
    }
}
