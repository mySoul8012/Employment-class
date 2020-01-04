package com.ming1;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class BufferDemo04 {
    public static void main(String[] args){
        // 创建Buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        // 添加数据
        byteBuffer.put((byte)20);
        byteBuffer.put((byte)30);
        System.out.println(Arrays.toString(byteBuffer.array()));
        // 获取长度
        System.out.println(byteBuffer.capacity());
    }
}
