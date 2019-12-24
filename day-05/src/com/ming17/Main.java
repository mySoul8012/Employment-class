package com.ming17;

import com.ming12.MyConTainer;

public class Main {
    public static void main(String[] args){
        MyConTainer<String> myConTainer = new MyContainerImpl<String>();
        myConTainer.add("3333");
        myConTainer.add("22222");
        System.out.println(myConTainer.length());
    }
}
