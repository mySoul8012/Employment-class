package com.ming1;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class BufferDemo06 {
    public static void main(String[] args){
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        // 查看位置
        System.out.println("当前位置 " + byteBuffer.position());
        // 进行数据添加;
        byteBuffer.put((byte)20);
        byteBuffer.put((byte)10);
        // 进行打印
        System.out.println(Arrays.toString(byteBuffer.array()));
        // 再次查看位置
        System.out.println(byteBuffer.position());
        // 打印
        System.out.println(byteBuffer);
    }
}
