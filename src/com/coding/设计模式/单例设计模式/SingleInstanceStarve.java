package com.coding.设计模式.单例设计模式;

public class SingleInstanceStarve {
    public static void main(String[] args) {
        GirlFriendStarve g3 = GirlFriendStarve.creatGirl("小美");
        GirlFriendStarve g4 = GirlFriendStarve.creatGirl("小乔");
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g3 == g4);
    }

}
