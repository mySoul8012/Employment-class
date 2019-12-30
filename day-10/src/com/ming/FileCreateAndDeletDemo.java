package com.ming;

import java.io.File;
import java.io.IOException;

public class FileCreateAndDeletDemo {
    public static void main(String[] args)throws IOException {
        // 创建File对象
        File f1 = new File("C:\\Users\\Administrator\\Pictures\\123.txt");
        File f2 = new File("C:\\Users\\Administrator\\Pictures\\33");
        boolean newFile = f1.createNewFile();
        System.out.println("是否成功" + newFile);
        // 创建文件夹
        boolean mkdir = f2.mkdir();
        // 打印结果
        System.out.println("是否成功 " + mkdir);
        // 删除文件
        boolean delete = f1.delete();
        System.out.println("删除文件是否成功" + delete);
        boolean delete1 = f2.delete();
        System.out.println("删除文件夹是否成功 " + delete1);

    }
}
