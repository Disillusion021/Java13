package com.coding.网络编程;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TCPFileCopyClient1 {
    public static void main(String[] args) throws IOException {
        // 向指定服务端发起连接
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        // 建立socket输出流,读取图片
        StreamUtils.BothStream bothStream = StreamUtils.inputToOut(Files.newInputStream(Paths.get("D:\\R-C.jpg")), socket.getOutputStream());
        // 通知服务端写入结束
        socket.shutdownOutput();
        // 接收服务器端回复
        InputStream sockReceiveReply = StreamUtils.inputPrintString(socket.getInputStream());
        // 关闭资源
        sockReceiveReply.close();
        bothStream.outputStream.close();
        bothStream.inputStream.close();
        socket.close();
    }
}
