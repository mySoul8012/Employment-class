package com.ming27;

import java.io.IOException;
import java.net.*;

public class UDPSender {
    public static void main(String[] args) throws IOException {
            // 创建数据发送器对象
            DatagramSocket datagramSocket = new DatagramSocket();
            // 创建数据报对象
            byte[] bytes = "今天气温 -12".getBytes();
           while(true) {
               // 进行封装数据包
               DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 12345);
               // 进行数据发送
               datagramSocket.send(datagramPacket);
           }
        }
    }
