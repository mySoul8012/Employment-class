package com.ming;

import java.io.*;
import java.math.BigDecimal;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test02 {
    public static void main(String[] args) throws IOException {

        // 创建map集合
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        // 进行读取
        Reader reader = new FileReader(new File("C:\\ming\\user.txt"));
        BufferedReader bufferedReader = new BufferedReader(reader);
        // 进行读取
        while(true){
            String tmp = bufferedReader.readLine();
            // 进行判空
            if(tmp == null){
                // 进行退出
                break;
            }
            // 进行继续读取
            // 进行字符串和分割
            String[] tmps = tmp.split(",");
            // 进行字符串读取
            hashMap.put(tmps[0], Integer.parseInt(tmps[1]));
        }

        //遍历集合，年龄大于30的，进行修改为30
        Set<String> keySet = hashMap.keySet();
        // 进行遍历
        for (String s : keySet) {
            // 进行判断
            if(hashMap.get(s) > 30){
                // 进行修改
                hashMap.put(s, 30);
            }
        }
        // 再次进行输出
        hashMap.forEach(new BiConsumer<String, Integer>() {
            /**
             * Performs this operation on the given arguments.
             *
             * @param s       the first input argument
             * @param integer the second input argument
             */
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s  + " "  + integer);
            }
        });
    }
}
