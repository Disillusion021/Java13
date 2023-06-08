package com.coding.网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings("all")
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        // 思路
        // 1. 在本机的9999端口监听, 等待连接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器在9999端口监听, 等待连接...");
        // 2. 通过socket.accept()等待连接, 当没有客户端连接9999端口时, 程序会阻塞, 等待连接;
        Socket socket = serverSocket.accept();
        System.out.println("有客户端连接到了本机的9999端口, 客户端主机名:" + socket.getInetAddress().getHostName() + ", IP地址:" + socket.getInetAddress().getHostAddress());
        // 3. 通过socket.getInputStream()再转换成BufferedReader,读取客户端写入到数据通道的数据
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        // 4. 通过socket.getOutputStream()写入数据返回给客户端
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello, client");
        bufferedWriter.flush();
        // 调用shutdownOutput()方法, 显式告诉客户端数据已经写完了, 否则客户端不知道服务端是否写完数据, 会一直等待数据写入
        socket.shutdownOutput();
        // 5. 关闭流资源和Socket, 必须关闭
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器已退出...");
    }
}
