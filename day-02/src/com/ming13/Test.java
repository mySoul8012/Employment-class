package com.ming13;

public class Test {
    public static void main(String[] args){
        Phone phone = new Phone() {
            @Override
            public void call() {
                System.out.println("发短信");
            }

            @Override
            public void sendMessage() {
                System.out.println("打电话");
            }
        };
        phone.call();
        phone.sendMessage();
    }
}
