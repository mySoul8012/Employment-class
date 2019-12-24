package com.ming21;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args){
        Collection<String> collection = new ArrayList<String>();
        collection.add("88");
        collection.add("5");
        collection.add("39");
        collection.add("2");
        collection.add("77.1");
        collection.add("56.8");
        collection.add("89");
        collection.add("99");
        collection.add("59.5");
        // 增强for遍历
        for(String s:collection){
            System.out.println(s);
        }

        // 增强 for 遍历所有元素，打印不及格元素
        for(String s:collection){
            double number = Double.parseDouble(s);
            // 计算不及格元素
            if(number < 60){
                System.out.println(number);
            }
        }

        // 增强for遍历所有元素，计算不及格分数的数量，平均分，
        int sum = 0;
        int index = 0;
        for(String s:collection){
            double number = Double.parseDouble(s);
            // 计算不及格分数的sum
            if(number < 60){
                sum += number;
                // 数量++
                index++;
            }
        }
        // 输出平均分
        System.out.println(sum / index);
    }
}
