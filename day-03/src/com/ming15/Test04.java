package com.ming15;

import java.math.BigDecimal;

/*
* 有以下double数组：
		double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
	请编程计算它们的总值及平均值(四舍五入保留小数点后2位)
* */
public class Test04 {
    public static void main(String[] args){
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
        BigDecimal sum = new BigDecimal(0);
        for(int i = 0; i < arr.length; i++){
            BigDecimal bigDecimal = new BigDecimal(arr[i]);
            sum = sum.add(bigDecimal);
        }
        System.out.println(sum.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
    }
}
