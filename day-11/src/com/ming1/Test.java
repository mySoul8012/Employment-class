package com.ming1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        // 进行加载
        properties.load(new FileReader("C:\\ming"));
        Set<String> keySet = properties.stringPropertyNames();

    }
}
