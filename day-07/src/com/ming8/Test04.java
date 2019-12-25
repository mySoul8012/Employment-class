package com.ming8;

public class Test04 {
    public static void main(String[] args){
        try {
            int n1 = getMax(null);
            int[] arr = new int[0];
            int n2 = getMax(arr);
            int[] arr2 = {1, 2, 3, 4, 24, 32, 5324, 32};
            int n3 = getMax(arr2);
        }catch (Exception e){
            System.out.println("出现错误");
        }
    }

    private static int getMax(int[] o) {
        int max = o[0];
        for(int i = 1 ; i < o.length ; i++){
            if(max < o[i]){
                max = o[i];
            }
        }
        return max;
    }
}
