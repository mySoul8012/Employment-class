package com.ming2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cat {
    // 进行构造方法私有化
    private Cat(){

    }

    // 定义静态变量 保存固定的对象个数
    private static final int COUNT = 5;
    // 定义集合保存固定对象个数
    private static final List<Cat> list = new ArrayList<>();
    // 静态代码块创建固定个数，进行添加到集合
    static {
        for(int i = 0; i < COUNT; i++){
            // 进行添加
            list.add(new Cat());
        }
    }

    // 提供静态方法，用于获取集合中的对象
    public static Cat getInstance(){
        Random random = new Random();
        // 进行随机获取
        int index = random.nextInt(list.size());
        // 返回数据
        return list.get(index);
    }
}
