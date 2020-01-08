package com.ming9;

import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        // 进行打印
        StudentManager studentManager = new StudentManagerImpl();
        studentManager.getStudentInfo("凤姐","女", 21);
    }
}
