package com.ming;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class BufferDemo04 {
    public static void main(String[] args){
        // 创建ByteBuffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        // 添加数据
        byteBuffer.put((byte)10);
        byteBuffer.put((byte)20);
        // 进行打印
        System.out.println(Arrays.toString(byteBuffer.array()));
        // 进行添加数组
        byte[] bytes = new byte[10];
        // 进行添加
        for(int i = 0; i < bytes.length; i++){
            // 进行添加
            bytes[i] = (byte) i;
        }
        // 进行添加数组
        byteBuffer.put(bytes);
        // 添加数组的一部分
        byteBuffer.put(bytes, 2, 4);
        // 打印数组
        System.out.println(Arrays.toString(byteBuffer.array()));

    }
}
