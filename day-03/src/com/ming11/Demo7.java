package com.ming11;

public class Demo7 {
    public static void main(String[] args){
        char[] cha = {'i', 't', 'c', 'a', 's', 'a'};
        System.arraycopy(cha, 1, cha, 5, 1);
        // 遍历数组
        for (char c : cha) {
            System.out.println(c);
        }
    }
}
