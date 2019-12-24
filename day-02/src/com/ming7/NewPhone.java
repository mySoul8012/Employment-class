package com.ming7;

public class NewPhone extends OldPhone implements Play{
    public void call(){
        System.out.println("call");
    }
    public void sendMessage(){
        System.out.println("message");
    }

    @Override
    public void playGame() {
        System.out.println("使用新手机玩游戏");
    }

    @Override
    public void NewPhone() {
        System.out.println("使用新手机打电话");
    }
}
