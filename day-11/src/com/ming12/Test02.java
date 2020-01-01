package com.ming12;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        // 进行文件复制
        FileUtils.copyFileToDirectory(new File("2.txt"), new File("/ming"));

    }
}
