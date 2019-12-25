package com.ming8;

public class Test05 {
    public static void main(String[] args){
        try {
            int n1 = getMax1(null);
            int[] arr = new int[0];
            int[] arr2 = {1, 2, 4, 24, 32, 5324, 32};
            int n3 = getMax1(arr2);
        }catch (Exception e){
            System.out.println("出现索引越界");
        }
    }

    private static int getMax1(int[] o) {
        int max = o[0];
        for(int i = 1; i < o.length; i++){
            if(max < o[i]){
                max = o[i];
            }
        }
        return max;

    }
}
