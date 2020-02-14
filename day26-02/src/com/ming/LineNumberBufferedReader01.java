package com.ming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class LineNumberBufferedReader01 extends BufferedReader {
    private int number = 1;

    public LineNumberBufferedReader01(Reader in, int sz) {
        super(in, sz);
    }

    // 重写readLine方法

    @Override
    public String readLine() throws IOException {
        // 获取原先的值
        String line = super.readLine();
        // 进行判断
        if(line == null){
            return null;
        }

        // 不为空，添加行号
        return (number++) + ":" + line;
    }
}
