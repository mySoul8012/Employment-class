package com.ming5;

public class Test {
    public static void main(String[] args){
        Feeder.feed(some -> System.out.println(some), "猫吃鱼");
    }
}
