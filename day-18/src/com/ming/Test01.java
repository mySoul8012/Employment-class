package com.ming;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test01 {
    //定义list集合,存储符合条件的文件名
    public static ArrayList<String> list=new ArrayList<>();

    public static void main(String[] args) throws IOException {

        File folder = new File("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-18\\src");
        //递归获取文件名
        checkFolder(folder);

        //创建输出流，将集合元素写入到当前目录的list.txt文件中，每个元素为一行
        BufferedWriter bw=null;
        bw = new BufferedWriter(new FileWriter("22.txt"));
        // 进行文件输出
        for (String s : list) {
            // 进行文件写入
            bw.write(s);
            bw.newLine();
            // 进行刷新
            bw.flush();
        }
        // 进行关闭流
        bw.close();


    }
    private static void checkFolder(File folder) throws IOException {

        //判断folder是否是文件夹，如果是文件夹则获取该文件夹目录下的所有文件并遍历，之后调用方法本身
        if(folder.isDirectory()){
            // 获取文件夹的文件目录
            File[] files = folder.listFiles();
            // 进行递归调用
            for (File file : files) {
                // 进行递归调用
                checkFolder(file);
            }
        }else {
            // 判断是否以java结尾
            if(folder.getName().endsWith(".java")){
                // 如果以Java结尾，进行保存
                list.add(folder.getPath());
            }
        }
    }
}
