package com.ming2;

import java.nio.ByteBuffer;

public class BufferDemo04 {
    public static void main(String[] args){
        // 堆中申请空间
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        // 进行数据加载
        byteBuffer.put((byte)30);
        // 创建间接缓冲区
        byte[] bytes = new byte[10];
        // 创建间接缓冲区
        ByteBuffer byteBuffer1 = ByteBuffer.wrap(bytes);


    }
}
