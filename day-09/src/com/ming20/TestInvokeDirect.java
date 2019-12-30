package com.ming20;

public class TestInvokeDirect {
    public static void main(String[] args){
        // 使用 lambda 标准格式，调用 invokeDirect
        invokeDirect(() -> {
            System.out.println("拍啦");
        });

        // 省略格式
        invokeDirect(() -> System.out.println("333"));
    }

    private static void invokeDirect(Director director){
        director.makeMovie();
    }
}
