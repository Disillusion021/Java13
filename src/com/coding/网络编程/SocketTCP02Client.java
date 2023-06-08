package com.coding.网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

@SuppressWarnings("all")
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        // 思路
        // 1. 连接服务端(ip,端口), 如果连接成功返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端连接成功, Socket返回:" + socket);
        // 2. 通过socket.getOutputStream()写入数据到数据通道
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, server".getBytes());
        // 调用shutdownOutput()方法, 显式告诉服务端数据已经写完了, 否则服务端不知道客户端是否写完数据, 会一直等待数据写入
        socket.shutdownOutput();
        // 3. 通过socket.getInputStream()读取服务端写入到数据通道的数据
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int read;
        while ((read = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, read));
        }
        // 4. 关闭流资源和Socket, 必须关闭
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端已退出...");
    }
}
