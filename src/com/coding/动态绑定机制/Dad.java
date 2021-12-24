package com.coding.动态绑定机制;

public class Dad {
    public String name = "老子";

    public String getName() {
        setName("设置Name属性");
        System.out.println(name);
        name = "祖宗" + this;
        return name;
    }

    public void setName(String name) {
        System.out.println("父类的方法");
        this.name = name;
    }
}
