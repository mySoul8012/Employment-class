package com.ming7;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        // 生成随机数
        Random random = new Random();
        // 生成数字
        int tmp = random.nextInt(100);
        while(true) {
        // 进行判断
        // 获取输入流
        Scanner scanner = new Scanner(System.in);
        // 获取数字
        System.out.println("请随机输入0-100的数字");
        int shurushuzhi = scanner.nextInt();
        // 进行数据判断

            if (shurushuzhi == tmp) {
                System.out.println("猜对了");
                break;
            } else if (shurushuzhi > tmp) {
                // 进行判断
                System.out.println("猜大了");
            } else if (shurushuzhi < tmp) {
                System.out.println("猜小了");
            }
        }
    }
}
