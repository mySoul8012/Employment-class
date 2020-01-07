package com.ming1;

public class RegexDemo02 {
    public static void main(String[] args){
        // 进行判断
        String str = "bad";
        // 按照要求进行判断
        System.out.println(str.matches("[^aeiou&&a-z]ad"));
        // 按照要求进行字符串判断
        System.out.println(str.matches("[a|e|i|o|u]ad"));
    }
}
