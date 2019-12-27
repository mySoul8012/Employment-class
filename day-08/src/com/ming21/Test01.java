package com.ming21;

public class Test01 {
    public static void main(String[] args){
        Test test = new Test();
        Thread thread = new Thread(test);
        // 启动线程
        thread.start();

        // 不读读取值
        while(true){
            System.out.println("输出结果 " + test.getAtomicBoolean().get());
        }
    }
}
