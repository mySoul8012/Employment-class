package com.ming9;

public class Computer extends ElectronicProduct implements Playable {
    public void open(){
        System.out.println("连接电源，打开电脑");
    }

    @Override
    public void close() {
        System.out.println("关闭电脑");
    }

    @Override
    public void playGame() {
        System.out.println("玩电脑游戏");
    }
}
