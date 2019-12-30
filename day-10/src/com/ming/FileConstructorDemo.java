package com.ming;

import java.io.File;

public class FileConstructorDemo {
    public static void main(String[] args){
        File file = new File("C:\\Users\\Administrator\\Pictures\\34295098.jpg");
        System.out.println(file);
        File file1 = new File("C:\\Users\\Administrator\\Pictures\\");
        System.out.println(file1);
        File f3 = new File("C:\\Users\\Administrator\\Pictures\\", "aaa\\2.java");
        System.out.println(f3);
        File parent = new File(f3, "aaa\\2.java");
        System.out.println(parent);
    }
}
