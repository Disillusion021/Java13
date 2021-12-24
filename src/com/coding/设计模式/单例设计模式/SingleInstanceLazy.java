package com.coding.设计模式.单例设计模式;

public class SingleInstanceLazy {
    public static void main(String[] args) {
        GirlFriendLazy g3 = GirlFriendLazy.getLazyGirl();
        GirlFriendLazy g4 = GirlFriendLazy.getLazyGirl();
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g3 == g4);
    }

}
