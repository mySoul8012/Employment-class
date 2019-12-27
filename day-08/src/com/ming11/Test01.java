package com.ming11;

// 多线程 可见性问题
public class Test01 {
    public static void main(String[] args){
        Thread thread = new Thread();
        java.lang.Thread thread1 = new java.lang.Thread(thread);
        // 进行启动
        thread1.start();
        // 修改
        boolean flg = false;
        thread.setFlag(flg);
    }
}
