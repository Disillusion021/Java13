package com.coding.网络编程;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        // 思路
        // 1. 连接服务端(ip,端口), 如果连接成功返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        // 打印socket显示socket在本机的端口,这个端口是由TCP/IP随机分配的
        System.out.println("客户端连接成功, Socket返回:" + socket);
        // 2. 通过socket.getOutputStream()写入数据到数据通道
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, server".getBytes());
        // 3. 关闭流资源和Socket, 必须关闭
        outputStream.close();
        socket.close();
        System.out.println("客户端已退出...");
    }
}
