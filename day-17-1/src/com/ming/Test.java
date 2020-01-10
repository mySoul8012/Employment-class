package com.ming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 单例设计模式
public class Test {
    // 进行私有化
    private Test(){

    }

    // 创建对象进行保存
    public static List<Cat> list = new ArrayList<>();
    // 创建静态代码块
    static {
        for(int i = 0; i < 10; i++){
            // 创建静态代码块
            list.add(new Cat());
        }
    }

    // 创建getset方法
    public static Cat getCat(){
        // 生成随机数
        int random = new Random().nextInt(10);
        // 随机返回
        return list.get(random);
    }
}
