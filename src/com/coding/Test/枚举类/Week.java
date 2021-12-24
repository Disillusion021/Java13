package com.coding.Test.枚举类;

public enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天");

    String name;

    Week(String name) {
        this.name = name;
    }
}

class Test2 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for (Week w : weeks) {
            System.out.println(w.name() + w.name);
        }
    }
}
