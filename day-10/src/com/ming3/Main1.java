package com.ming3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\ming\\ming.txt");
        int len;
        char[] charArr = new char[3];
        while((len = fileReader.read(charArr)) != -1){
            System.out.println(new String(charArr, len, 0));
        }
    }
}
