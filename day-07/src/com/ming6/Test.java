package com.ming6;

public class Test {
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("播放背景音乐");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("显示画面");
            }
        }).start();
    }
}
