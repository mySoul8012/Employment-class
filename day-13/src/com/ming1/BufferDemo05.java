package com.ming1;

import java.nio.ByteBuffer;

public class BufferDemo05 {
    public static void main(String[] args){
        // 进行limit限制
        ByteBuffer byteBuffer = ByteBuffer.allocate(15);
        // 添加数据
        byteBuffer.put((byte)30);
        byteBuffer.put((byte)40);
        byteBuffer.put((byte)20);
        // 进行打印
        System.out.println(byteBuffer);
        // 查看限制
        System.out.println("限制 " + byteBuffer.limit());
        // 修改限制
        byteBuffer.limit(5);
        // 进行添加
        byteBuffer.put((byte)20);
        byteBuffer.put((byte)10);
        byteBuffer.put((byte)10);

    }
}
