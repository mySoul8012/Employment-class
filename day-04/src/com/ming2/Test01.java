package com.ming2;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        // 查询是否有@和.符号
        if(!email.contains("@")){
            System.out.println("不包含@符号");
        }

        if(!email.contains(".")){
            System.out.println("不包含.符号");
        }
    }
}
