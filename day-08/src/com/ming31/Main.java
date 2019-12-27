package com.ming31;

import java.util.Set;

public class Main {
    public static void main(String[] args){
        Test test = new Test(true);
        // 创建线程
        Thread thread = new Thread(test);
        test.setFlag(false);
        Thread thread1 = new Thread(test);
        // 启动线程
        thread.start();
        thread1.start();
        // 获取结果
        while(true){
            if(test.getConcurrentMap().size() >= 200){
                // 输出结果
                Set<Integer> integerSet = test.getConcurrentMap().keySet();
                // 进行结果输出
                for(Integer integer:integerSet){
                    // 进行输出
                    System.out.println(integer + "  " + test.getConcurrentMap().get(integer));
                }
            }
        }
    }
}
