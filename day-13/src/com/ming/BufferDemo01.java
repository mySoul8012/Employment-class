package com.ming;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class BufferDemo01 {
    public static void main(String[] args){
        // 在堆区申请空间
        // 申请间接缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        System.out.println(Arrays.toString(byteBuffer.array()));
        // 直接缓冲区
        // 在系统内存中申请空间，直接缓冲区
        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(20);
        // 间接缓冲区，创建和销毁，高于直接缓冲区，
        // 创立间接缓冲区
        byte[] bytes = new byte[10];
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(bytes);
    }
}
