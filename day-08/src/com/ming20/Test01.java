package com.ming20;

public class Test01 {
    public static void main(String[] args){
        Test test = new Test();
        for(int i = 0; i < 100; i++){
            new Thread(test).start();
        }
    }
}
