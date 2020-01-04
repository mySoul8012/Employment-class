package com.ming1;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class BufferDemo07 {
    public static void main(String[] args){
        // 创建Buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        // 添加元素
        byteBuffer.put((byte)20);
        byteBuffer.put((byte)10);
        byteBuffer.put((byte)10);
        // 添加标记
        System.out.println(Arrays.toString(byteBuffer.array()));
        System.out.println(byteBuffer);
        byteBuffer.mark();
        // 继续添加数据
        byteBuffer.put((byte)20);
        byteBuffer.put((byte)10);
        // 进行输出
        System.out.println(Arrays.toString(byteBuffer.array()));
        // 重置缓冲区
        byteBuffer.reset();
        // 继续添加
        byteBuffer.put((byte)0);
        byteBuffer.put((byte)0);
        System.out.println(Arrays.toString(byteBuffer.array()));
        System.out.println(byteBuffer);

    }
}
