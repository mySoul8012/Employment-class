package com.ming12;

public class Main {
    public static void main(String[] args){
        // 进行数据添加
        MyConTainer<String> myConTainer = new MyConTainerImpl<String>();
        // 数据添加
        for(int i = 0; i < 1000; i++){
            myConTainer.add("111" + i);
        }
        // 输出长度
        System.out.println(myConTainer.length());


    }
}
