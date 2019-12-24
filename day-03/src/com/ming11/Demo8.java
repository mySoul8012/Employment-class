package com.ming11;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo8 {
    public static void main(String[] args){
        String[] nums = {"3.22","8.1","7","2.5","3.1","7.77","8.0","9.21"};
        BigDecimal res = new BigDecimal("0");
        // 遍历进行相加
        for(String num: nums){
            BigDecimal db = new BigDecimal(num);// 数组每个元素构造一个BigDecimal对象
            res = res.add(db);
        }
        // 进行四舍五入
        BigDecimal avg = res.divide(new BigDecimal(nums.length), 2, RoundingMode.HALF_UP);
        System.out.println("平均值" + avg.doubleValue());
    }
}
