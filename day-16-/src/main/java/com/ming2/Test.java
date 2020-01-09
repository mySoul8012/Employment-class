package com.ming2;

public class Test {
    public static void main(String[] args){
        // 进行循环创建对象
        for(int i = 0; i< 10; i++){
            // 进行打印
            System.out.println(Cat.getInstance());
        }
    }
}
