package com.coding.设计模式.动态代理;

public class Star implements IStar {

    public String sing(String songName) {
        System.out.println("明星唱歌" + songName);
        return "谢谢大家";
    }

    public void dance(String danceName) {
        System.out.println("明星跳舞" + danceName);
    }

}
