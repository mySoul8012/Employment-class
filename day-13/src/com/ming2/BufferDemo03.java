package com.ming2;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class BufferDemo03 {
    public static void main(String[] args){
        // 创建Buffer
        ByteBuffer buffer = ByteBuffer.allocate(10);
        // 进行输出
        System.out.println("当前位置 " + buffer.position());
        System.out.println("当前限制 " + buffer.limit());
        // 添加数据
        buffer.put((byte)10);
        buffer.put((byte)12);
        // 修改限制
        buffer.limit(5);
        // 进行mark
        buffer.mark();
        // 继续添加数据
        buffer.put((byte) 30);
        // 进行数据清空
        buffer.clear();
        // 进行打印
        System.out.println(Arrays.toString(buffer.array()));
    }
}
