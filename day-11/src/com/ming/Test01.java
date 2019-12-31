package com.ming;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        try{
            fileReader = new FileReader("C:\\Users\\Administrator\\Pictures\\34295098.txt");
            // 读数据
            int ch = fileReader.read();
            // 进行输出
            System.out.println((char) ch);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 进行资源释放
            // 进行判断
            if(fileReader != null){
                // 如果不为空，进行释放
                fileReader.close();
            }
        }
    }
}
