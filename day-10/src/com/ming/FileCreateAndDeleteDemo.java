package com.ming;

import java.io.File;
import java.io.IOException;

public class FileCreateAndDeleteDemo {
    public static void main(String[] args)throws IOException{
        // 创建File对象
        File f1 = new File("C:\\ming\\233.txt");
        File f2 = new File("C:\\ming\\233");
        // 创建文件
        boolean newFile = f1.createNewFile();
        System.out.println("是否成功 " + newFile);

        // 创建文件夹
        boolean mkdir = f2.mkdir();
        System.out.println("是否成功 " + mkdir);
        // 删除文件或者文件夹
        boolean delete = f1.delete();
        System.out.println("删除文件是否成功 " + delete);
        boolean delete1 = f1.delete();
        System.out.println("删除文件是否成功 " + delete1);
        // 删除文件的时，只能删除空文件夹
    }
}
