package com.ming27;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
       // 创建接收器对象
        DatagramSocket datagramSocket = new DatagramSocket(12345);
        // 创建数据报对象
        byte[] bytes = new byte[1024];
        // 创建数据包
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        // 进行数据接收
        while(true){
            // 进行阻塞
            datagramSocket.receive(datagramPacket);
            // 进行数据接收
            int len = datagramPacket.getLength();
            // 进行数据接收
            byte[] bytes1 = datagramPacket.getData();
            // 进行数据输出
            System.out.println(new String(bytes1, 0, len));
        }
    }
}
