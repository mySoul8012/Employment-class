package com.ming;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class BufferDemo03 {
    public static void main(String[] args){
        // 在堆中申请空间
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        // 进行打印
        System.out.println(Arrays.toString(byteBuffer.array()));
        // 申请直接缓冲区
        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(10);
        System.out.println(byteBuffer1);
        // 申请间接缓冲区
        byte[] bytes = new byte[1024];
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(bytes);
        // 进行打印
        System.out.println(Arrays.toString(byteBuffer2.array()));

    }
}
