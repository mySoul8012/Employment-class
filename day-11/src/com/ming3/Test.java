package com.ming3;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // 进行复制文件
        IOUtils.copy(new FileInputStream("2.txt"), new FileOutputStream("3.txt"));
        IOUtils.copyLarge(new FileInputStream("2.txt"), new FileOutputStream("4.txt"));
    }
}
