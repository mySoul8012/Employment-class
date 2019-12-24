package com.ming15;

/*
* 有以下数组：
		int[] arr = {10,27,8,5,2,1,3,55,88};
	请定义一个新数组，长度为5，并将arr中几个连续的1位数的数字复制到新数组。
*
* */
public class Test01 {
    public static void main(String[] args){
        int[] arr = {10,27,8,5,2,1,3,55,88};
        int[] arr1 = new int[10];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(String.valueOf(arr[i]).length() == 1){
                arr1[index] = arr[i];
                index++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
