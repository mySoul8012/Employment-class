package com.ming5;

public class Test {
    public static void main(String[] args){
        Fu f = new Zi();
        Zi z = new Zi();
        f.show();
        z.show();
    }
}

class Fu{
    int num = 4;
    void show(){
        System.out.println("showFu");
    }
}

class Zi extends Fu{
    int num = 5;
    void show(){
        System.out.println("show2i");
    }
}

