package com.ming5;

public class Test06 {
    public static void main(String[] args){
        String dir = "E:\\\\Workspace\\\\201909\\\\day14\\\\RegexTest.java";
        // 进行字符串分割
        String[] arr =  dir.split("\\\\");
        // 进行循环
        for(int i = 0; i < arr.length; i++){
            // 进行输出
            System.out.println(arr[i]);
        }
    }
}
