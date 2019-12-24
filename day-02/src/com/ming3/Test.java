package com.ming3;

import java.util.Random;

public class Test {
    public static void main(String[] args){
        int[] numberInt = new int[10];
        for(int i = 0; i < numberInt.length; i++){
            Random random = new Random();
            numberInt[i] = random.nextInt(100) + 1;
        }
        System.out.println(Const.getSum(numberInt));
    }
}
