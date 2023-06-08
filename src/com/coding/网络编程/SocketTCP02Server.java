package com.coding.网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings("all")
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        // 思路
        // 1. 在本机的9999端口监听, 等待连接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器在9999端口监听, 等待连接...");
        // 2. 通过socket.accept()等待连接, 当没有客户端连接9999端口时, 程序会阻塞, 等待连接;
        Socket socket = serverSocket.accept();
        System.out.println("有客户端连接到了本机的9999端口, 客户端主机名:" + socket.getInetAddress().getHostName() + ", IP地址:" + socket.getInetAddress().getHostAddress());
        // 3. 通过socket.getInputStream()读取客户端写入到数据通道的数据
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readNum;
        while ((readNum = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readNum));
        }
        // 4. 通过socket.getOutputStream()写入数据返回给客户端
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, client".getBytes());
        socket.shutdownOutput();
        // 5. 关闭流资源和Socket, 必须关闭
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器已退出...");
    }
}
