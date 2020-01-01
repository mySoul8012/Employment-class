package com.ming12;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        FileUtils.copyDirectoryToDirectory(new File("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\ming\\"), new File("C:\\Users"));
    }
}
