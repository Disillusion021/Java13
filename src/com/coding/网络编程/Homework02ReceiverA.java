package com.coding.网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Homework02ReceiverA {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        datagramSocket.receive(packet);
        String receive = new String(packet.getData(), 0, packet.getLength());
        System.out.println(receive);
        byte[] bytes;
        if ("四大名著是哪些".equals(receive)) {
            bytes = "四大名著是<<红楼梦>>...".getBytes();
        } else {
            bytes = "what?".getBytes();
        }
        DatagramPacket packet1 = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 9999);
        datagramSocket.send(packet1);
        datagramSocket.close();
    }
}
