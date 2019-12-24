package com.ming9;

public class Test {
    public static void testPlayGame(Playable p){
        p.playGame();
    }
    public static void main(String[] args){
        testPlayGame(new Phone());
    }
}
