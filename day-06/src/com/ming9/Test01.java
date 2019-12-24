package com.ming9;

import java.util.HashSet;
import java.util.Random;

public class Test01 {
    public static void main(String[] args){
        // 使用HashSet 进行去重
        HashSet<Integer> red = new HashSet<>();
        HashSet<Integer> blue = new HashSet<>();
        Random random = new Random();
        // 生成红色球
        for(int i = 0; i < 6; i++){
            if(!red.add(random.nextInt(33) + 1)){
                i--;
            }
        }
        System.out.println(red);

        // 生成蓝色球
        for(int i = 0; i < 1; i++){
            if(!blue.add(random.nextInt(16) + 1)){
                i--;
            }
        }

        // 输出蓝色球
        System.out.println(blue);


    }
}
