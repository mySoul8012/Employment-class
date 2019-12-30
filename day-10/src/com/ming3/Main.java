package com.ming3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\ming\\ming.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\ming\\ming1.txt");
        int temp = 0;
        while((temp = fileInputStream.read()) != -1){
            fileOutputStream.write(temp);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
