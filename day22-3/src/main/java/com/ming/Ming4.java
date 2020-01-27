package com.ming;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

// 控制台，输入文件，进行判断
public class Ming4 {
    public static void main(String[] args) throws IOException {
        // 创建输入流
        Scanner scanner = new Scanner(System.in);
        // 进行提示
        System.out.println("请输入文件路径");
        // 获取文件路径
        String tmp = scanner.nextLine();
        // 进行判断
        if(tmp.length() == 0){
            return;
        }
        // 生成文件对象
        File file = new File(tmp);
        // 进行文件判断
        // 判断文件是否存在
        if(file.isFile()){
            // 判断文件是否存在
            // 此时文件存在
            // 进行复制
            // 获取根目录File
            File file1 = new File("C:\\Users\\Administrator\\Pictures\\");
            FileUtils.copyFileToDirectory(file, file1);
            // 文件复制完成
        }
    }
}
