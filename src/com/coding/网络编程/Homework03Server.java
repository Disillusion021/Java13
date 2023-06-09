package com.coding.网络编程;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;

public class Homework03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = StreamUtils.inputToByteArray(inputStream);
        String musicName = new String(bytes);
        System.out.println(musicName);
        File file = new File("D:\\CloudMusic\\" + musicName);
        if (!file.exists()) {
            System.out.println("歌曲不存在");
            file = new File("D:\\CloudMusic\\\\bilibilijj.com-%e3%80%90asmr%e3%80%91%e8%b4%b4%e7%9d%80%e5%a6%b9%e5%ad%90%e8%83%b8%e5%8f%a3%e8%81%86%e5%90%ac%e5%bf%83%e8%b7%b3%e8%bf%91%e8%80%b3%e7%bb%86%e8%af%ad%e5%93%bc%e5%94%b1_%.mp3");
        }
        StreamUtils.BothStream bothStream = StreamUtils.inputToOut(Files.newInputStream(file.toPath()), socket.getOutputStream());
        socket.shutdownOutput();
        // 关闭资源
        bothStream.outputStream.close();
        bothStream.inputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
