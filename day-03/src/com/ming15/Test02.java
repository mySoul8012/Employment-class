package com.ming15;

// 	有以下数组：
//		int[] arr = {55,77,0,88,22,44,33};
//	请编程实现：将后四个数字依次前移一位，移动后，最后一位置为0.
public class Test02 {
    public static void main(String[] args){
        int[] arr = {55, 77, 0, 88, 22, 44, 33};
        // 后四个数字依次前移一位
        for(int i = arr.length - 4 - 1; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
