package com.ming3;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        // 复制文件到某个文件夹下
        FileUtils.copyFileToDirectory(new File("2.txt"), new File("./ming"));
    }
}
