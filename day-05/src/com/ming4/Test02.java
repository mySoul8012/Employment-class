package com.ming4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// 定义一个方法int  listTest(ArrayList<Integer> al, Integer s)，
// 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
public class Test02 {
    public static void main(String[] args){
        List<Integer> integers = new ArrayList<>();
        // 生成数据
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            integers.add(random.nextInt(100) + 1);
        }
        // 打印生成的数据
        System.out.println(integers);

        // 获取数据
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        // 进行查找
        System.out.println(ListTest(integers, number1));

    }
    public static int ListTest(List<Integer> al, Integer s){
        int index = 0;
        for(int i = 0; i < al.size(); i++){
            if(al.get(i).equals(s)){
                index = i;
            }
        }
        return index;
    }
}
