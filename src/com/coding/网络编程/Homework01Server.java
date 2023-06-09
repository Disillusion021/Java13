package com.coding.网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        BufferedWriter bw;
        while (true) {
            String question = br.readLine();
            String answer;
            if ("name".equals(question)) {
                answer = "我是disillusion";
            } else if ("hobby".equals(question)) {
                answer = "编写java程序";
            } else if (":q".equals(question)) {
                answer = "退出程序";
            } else {
                answer = "你说啥呢";
            }
            OutputStream outputStream = socket.getOutputStream();
            bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            bw.write(answer);
            bw.newLine();
            bw.flush();
            if (":q".equals(question)) {
                break;
            }
        }
        // 关闭资源
        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器已退出...");
    }
}
