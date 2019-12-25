package com.ming;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};
        System.out.println(Arrays.toString(arr));

        // 冒泡升序排序 冒泡升序排序 外层控制趟，内层控制次数
        // 外层趟数
        for(int i = 0; i < arr.length - 1 ; i++){
            // 内层次数
            com.ming8.Test.ning(arr, i);
        }
        // 此时输出
        System.out.println(Arrays.toString(arr));

    }
}
