package com.ming15;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        print(arr);//这样调用是否正确？为什么？ 正确，传入了一个数组

      //  print(1,2,3);//这样调用是否正确？为什么？不正确，因为传入的不是数组

        ArrayList<Integer> list = new ArrayList<>();
    //    print(list);//这样调用是否正确？为什么？ 不正确，因为参数是 int 不是集合

     //   print();//这样调用是否正确？为什么？ 不正确，因为参数不能为空

    }
    public static void print(int[] arr){
    }
}
