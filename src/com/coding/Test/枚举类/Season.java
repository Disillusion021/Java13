package com.coding.Test.枚举类;
// 自定义枚举类
// 私有化构造器，防止new对象
// 在类里创建static final 枚举对象
// 提供get但不提供set方法，防止属性被修改

public class Season {

    private String name;
    private String desc;

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public static Season SPRING = new Season("春天","温暖");
    public static Season SUMMER = new Season("夏天","炎热");
    public static Season AUTUMN = new Season("秋天","凉爽");
    public static Season WINTER = new Season("冬天","寒冷");

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}
