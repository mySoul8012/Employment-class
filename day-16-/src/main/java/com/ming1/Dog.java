package com.ming1;

public class Dog {
    // 创建对象
    private static Dog dd;

    // 生成对象
    private Dog(){

    }

    // 提供静态对象
    public static Dog getInstance(){
        // 进行判断
        if(dd == null){
            // 生成对象
            dd = new Dog();
        }
        return dd;
    }
}
