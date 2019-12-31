package com.ming;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        // 创建字节流
        FileReader fileReader = null;
        try{
            // 创建字节流
            fileReader = new FileReader("C:\\Users\\Administrator\\Pictures\\34295098.txt");
            // 进行读数据率
            int res = fileReader.read();
            // 进行输出
            System.out.println((char)res);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 进行关闭
            // 判空
            if(fileReader != null){
                // 如果不为空，进行关闭
                fileReader.close();
            }
        }
    }
}
