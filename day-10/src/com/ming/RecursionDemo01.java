package com.ming;

public class RecursionDemo01 {
    public static void main(String[] args){
        method(10);
    }

    private static void method(int i) {
        if(i == 0){
            return;
        }
        System.out.println("method...");
        method(i - 1);
    }
}
