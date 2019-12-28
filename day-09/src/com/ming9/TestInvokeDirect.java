package com.ming9;

public class TestInvokeDirect {
    public static void main(String[] args){
        // 使用 Lambda调用 方法
         invokeDirect(() -> {
             System.out.println("导演拍电影了");
         });

         invokeDirect(() -> System.out.println("导演拍电影了"));
    }

    private static void invokeDirect(Director director){
        director.makeMovie();
    }
}
