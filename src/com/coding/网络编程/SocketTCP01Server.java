package com.coding.网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        // 思路
        // 1. 在本机的9999端口监听, 等待连接
        //  细节: 要求在本机没有其他服务监听9999端口
        //  细节: 这个ServerSocket可以通过accept()返回多个Socket(客户端)连接[这就是多个客户端连接服务器的并发原理]
        //  1个ServerSocket监听一个端口, 1个ServerSocket可以接收N个Socket连接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器在9999端口监听, 等待连接...");
        // 2. 通过socket.accept()等待连接, 当没有客户端连接9999端口时, 程序会阻塞, 等待连接;
        //  如果有客户端连接,则会返回Socket对象,程序继续.
        //  1个Socket代表1个客户端连接, 1个ServerSocket可以接收N个客户端连接
        Socket socket = serverSocket.accept();
        System.out.println("有客户端连接到了本机的9999端口, 客户端主机名:" + socket.getInetAddress().getHostName() + ", IP地址:" + socket.getInetAddress().getHostAddress());
        // 3. 通过socket.getInputStream()读取客户端写入到数据通道的数据
        //  细节: 如果inputStream读不到数据, 客户端没有写入数据, 则程序会阻塞在这里, 等待客户端写入数据, 除非客户端关闭输出流, 服务端才会结束阻塞
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readNum;
        while ((readNum = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readNum));
        }
        // 4. 关闭流资源和Socket, 必须关闭
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器已退出...");
    }
}
