package com.ming16;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class UDPClient {
    public static void main(String[] args) throws IOException {
       // 创建接收对象
        DatagramSocket datagramSocket = new DatagramSocket(54321);
        // 进行数据发送
        while(true){
            DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
            // 进行数据接收
            datagramSocket.receive(datagramPacket);
            // 进行数据打印
            int len = datagramPacket.getLength();
            byte[] bytes = datagramPacket.getData();
            // 进行输出
            System.out.println(new String(bytes, len));
            // 进行数据打印
            datagramSocket.send(new DatagramPacket("利好".getBytes(), "利好".length(), InetAddress.getByName("127.0.0.1"), 54321));
            //字符输入流

        }
    }
}
