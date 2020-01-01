package com.ming3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("C:\\ming\\ming.txt"));
        Set<String> keys = properties.stringPropertyNames();
        // 进行循环遍历
        Iterator<String> iterator = keys.iterator();
        // 进行遍历
        while(iterator.hasNext()){
            // 进行输出
            System.out.println((String)iterator.next());
        }
    }
}
