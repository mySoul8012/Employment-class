package com.ming8;

public class Test {
    public static void main(String[] args){
        long time = System.currentTimeMillis();
        System.out.println(time);
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            System.out.println("hello world");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        // 数组复制
        int[] src = {1,2,3,4,5};
        int[] des = {4,5,6,7,8};
        System.arraycopy(src, 0, des, 0, 3);
        for (int de : des) {
            System.out.println(de);
        }
        int[] arr = new int[100];
        arr = null;
        System.gc();
    }
}
