package com.coding.Test.枚举类;
//使用enum枚举类来创建
//enum关键字代表SeasonEnum继承了Enum类
public enum SeasonEnum {
    SPRING("春天","温暖"),
    SUMMER("夏天","温暖"),
    AUTUMN("秋天","温暖"),
    WINTER("冬天","温暖"),;


    private String name;
    private String desc;

    private SeasonEnum(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

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

class Test1 {
    public static void main(String[] args) {
        System.out.println(SeasonEnum.SPRING);
        System.out.println(SeasonEnum.SUMMER);
        System.out.println(SeasonEnum.AUTUMN);
        System.out.println(SeasonEnum.WINTER);
    }
}

