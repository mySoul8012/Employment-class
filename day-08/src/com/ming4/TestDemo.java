package com.ming4;

import com.ming3.Const;

public class TestDemo {
    public static void main(String[] args)throws InterruptedException{
        Tjhread1A tjhread1A = new Tjhread1A();
        Tjhread1A tjhread1A1 = new Tjhread1A();
        tjhread1A.setName("线程1-");
        tjhread1A.setName("线程2-");
        tjhread1A.start();
        tjhread1A1.start();
        for(int i = 0; i < 5; i++){
            Thread.sleep(10000);
            System.out.println(i);
        }
        // 打印集合大小
        System.out.println("Map大小" + Const.map.size());
    }
}
