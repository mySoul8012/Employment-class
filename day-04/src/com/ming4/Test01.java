package com.ming4;

public class Test01 {
    public static void main(String[] args){
        String charString = "积分看电视了几分我特朗普将反恐文件风IE哦特朗普积分哦忘记特朗普";
        // 进行字符串替换
        String[] keyArray = {"特朗普", "普京"};
        for (String s : keyArray) {
            charString = charString.replaceAll(s, "*");
        }
        System.out.println(charString);


    }
}
