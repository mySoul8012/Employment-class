package com.ming9;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test1 {
    public static void main(String[] args){
        System.out.println(0.09 + 0.01);
        BigDecimal b1 = new BigDecimal("10");
        BigDecimal b2 = new BigDecimal("3");
        System.out.println(b1.divide(b2, 2, RoundingMode.HALF_UP));
    }
}
