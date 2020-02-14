package com.ming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class LineNumberBufferedReader extends BufferedReader {
    // 定义行号
    private int num = 1;
    public LineNumberBufferedReader(Reader in, int sz) {
        super(in, sz);
    }

    @Override
    public String readLine() throws IOException {
        // 读取一行数据
        String data =  super.readLine();
        // 进行判断
        if(data == null){
            return null;
        }
        // 不为空，加行号
        return (num ++) + ":" + data;
    }


}
