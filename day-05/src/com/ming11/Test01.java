package com.ming11;

import java.util.ArrayList;
import java.util.List;

// 判断里面是否有元素
public class Test01 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        // 元素添加
        list.add("33333");
        list.add("44444");
        list.add("55555");
        // 判断是否有元素
        if(isEmpty(list)){
            System.out.println("里面有元素");
        }else{
            System.out.println("里面没有元素");
        }
    }

    private static boolean isEmpty(List<String> list) {
        // 进行判断里面是否有元素
        if(list.size() == 0){
            return false;
        }
        return true;
    }
}
