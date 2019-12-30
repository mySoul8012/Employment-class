package com.ming21;

public class Test {
    public static void main(String[] args){
        invokeCalc(3, 4, (a, b) -> {
            return a + b;
        });

        invokeCalc(3, 4, (a, b) ->  a + b);
    }

    public static void invokeCalc(int a, int b, Calculator calculator){
        int res = calculator.calc(a, b);
        // 输出结果
        System.out.println("输出的结果是 " + res);
    }
}
