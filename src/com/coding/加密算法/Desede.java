package com.coding.加密算法;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class Desede {
    private static final String Algorithm = "DESede";
    public static final String CIPHER_ALGORITHM = "DESede/ECB/PKCS5Padding";

    public static void main(String[] args) throws IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String clearText = "{\"code\": 1,\"msg\": \"\"}";
        String originKey = "12345678abcdefgh87654321";
        String cipherText = desEncript(clearText, originKey);
        System.out.println("加密结果是:" + cipherText);
        String clearText1 = desDecript(cipherText, originKey);
        System.out.println("解密结果是:" + clearText1);
    }

    private static String desEncript(String clearText, String originKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM); /*提供加密的方式：DES*/
        SecretKeySpec key = getKey(originKey);  /*对密钥进行操作，产生16个48位长的子密钥*/
        cipher.init(Cipher.ENCRYPT_MODE, key); /*初始化cipher，选定模式，这里为加密模式，并同时传入密钥*/
        byte[] doFinal = cipher.doFinal(clearText.getBytes());   /*开始加密操作*/
        String encode = Base64.encode(doFinal);    /*对加密后的数据按照Base64进行编码*/
        return encode;
    }

    private static String desDecript(String cipherText, String originKey) throws BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);   /*初始化加密方式*/
        Key key = getKey(originKey);  /*获取密钥*/
        cipher.init(Cipher.DECRYPT_MODE, key);  /*初始化操作方式*/
        byte[] decode = Base64.decode(cipherText);  /*按照Base64解码*/
        byte[] doFinal = cipher.doFinal(decode);   /*执行解码操作*/
        return new String(doFinal);   /*转换成相应字符串并返回*/
    }

    /**
     * 获取密钥算法
     *
     * @param originKey
     * @return
     */
    private static SecretKeySpec getKey(String originKey) {
        byte[] buffer = new byte[24];
        byte[] originBytes = originKey.getBytes();
        /**
         * 防止输入的密钥长度超过192位
         */
        for (int i = 0; i < 24 && i < originBytes.length; i++) {
            buffer[i] = originBytes[i];  /*如果originBytes不足24,buffer剩余的补零*/
        }
        SecretKeySpec key = new SecretKeySpec(buffer, Algorithm); /*第一个参数是密钥字节数组，第二个参数是加密方式*/
        return key;  /*返回操作之后得到的密钥*/
    }
}
