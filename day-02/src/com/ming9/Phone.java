package com.ming9;

public class Phone extends ElectronicProduct implements Playable{
    @Override
    public void playGame() {
        System.out.println("玩手机游戏");
    }

    @Override
    public void open() {
        System.out.println("打开手机，使用电池供电");
    }

    @Override
    public void close() {
        System.out.println("关闭手机，取出电池");
    }
}
