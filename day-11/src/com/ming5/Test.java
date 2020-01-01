package com.ming5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        // 使用字节流循环读取多个文件
        List<String> list = new ArrayList<>();
        BufferedInputStream bufferedInputStream = null;
        // 创建输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("4.txt"));
        for(int i = 1; i < 6; i++){
            // 创建输入流
            bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\ming\\" + "ming" + i + ".txt"));

            // 进入文件读取，保存进入 数组中
            // 对文件进入读取
            int len = 0;
            byte[] bytes = new byte[1024 * 10];
            while((len = bufferedInputStream.read(bytes)) != -1){
                // 进行读取
                System.out.println(new String(bytes));
                bufferedOutputStream.write(bytes, 0, len);
            }
            // 输出文件结束
            bufferedOutputStream.write("/r/n".getBytes());
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();

        // 输出结束
        System.out.println("文件结束");
    }
}
