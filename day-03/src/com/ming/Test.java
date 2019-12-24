package com.ming;

public class Test {
    public static void main(String[] args){
        System.out.println("a");
        System.out.println("b");
        {
            int[] arr = new  int[1024 * 1024];
            System.out.println("局部代码块");
        }
        System.out.println("c");
        System.out.println("d");
    }
}
