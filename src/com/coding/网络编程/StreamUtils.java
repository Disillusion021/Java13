package com.coding.网络编程;

import java.io.*;

public class StreamUtils {

    public static class BothStream {
        public final InputStream inputStream;
        public final OutputStream outputStream;

        public BothStream(InputStream inputStream, OutputStream outputStream) {
            this.inputStream = inputStream;
            this.outputStream = outputStream;
        }
    }

    /**
     * 将输入流写入输出流
     *
     * @param inputStream  输入流
     * @param outputStream 输出流
     * @return 返回输入流和输出流
     * @throws IOException 有异常则抛出
     */
    public static BothStream inputToOut(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        int readNum;
        byte[] picBuff = new byte[1024];
        while ((readNum = bis.read(picBuff)) != -1) {
            bos.write(picBuff, 0, readNum);
        }
        bos.flush();
        return new BothStream(bis, bos);
    }

    /**
     * 打印输入流中的短文本
     *
     * @param inputStream 输入流
     * @return 返回输入流
     * @throws IOException 有异常则抛出
     */
    public static InputStream inputPrintString(InputStream inputStream) throws IOException {
        int readNum2;
        byte[] buf = new byte[1024];
        readNum2 = inputStream.read(buf);
        System.out.print(new String(buf, 0, readNum2));
        return inputStream;
    }

    /**
     * 将输入流转换为 byte[],把文件读入到内存中
     *
     * @param is 输入流
     * @return 返回byte[]字节数组
     */
    public static byte[] inputToByteArray(InputStream is) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(is);
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            int readNum;
            byte[] buf = new byte[1024];
            while ((readNum = bis.read(buf)) != -1) {
                bos.write(buf, 0, readNum);
            }
            return bos.toByteArray();
        }
    }

}

