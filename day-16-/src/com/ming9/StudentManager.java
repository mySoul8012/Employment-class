package com.ming9;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface StudentManager {
    void getStudentInfo(String name,String sex, int age) throws IOException;
}
