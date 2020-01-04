package com.ming1;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class BufferDemo03 {
    public static void main(String[] args){
        // 创建Buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        // 获取容量
        System.out.println("容量是 : " + byteBuffer.capacity());
        // 添加数据
        byteBuffer.put((byte)10);
        byteBuffer.put((byte)20);
        // 再次获取容量
        System.out.println(byteBuffer.capacity());
        // 打印数组
        System.out.println(Arrays.toString(byteBuffer.array()));
    }
}
