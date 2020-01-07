package com.ming17;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        // 定义集合
        List names = new ArrayList();
        // 进行添加
        names.add("xiaoxiao");
        names.add("mingming");
        names.add("ming");
        // 进行输出
        names.forEach(System.out::print);
    }
}
