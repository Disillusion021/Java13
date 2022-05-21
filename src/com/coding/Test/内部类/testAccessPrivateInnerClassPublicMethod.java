package com.coding.Test.内部类;

import java.util.List;

// 测试访问私有成员内部类的的公开方法
// 方法三：外部其他类通过外部类的一个public工厂方法返回私有化内部类对象，并且以公开的接口上转型接收，接口中定义抽象方法，通过接口调用私有化内部类对象的public抽象方法的具体实现。
public class testAccessPrivateInnerClassPublicMethod {
    public static void main(String[] args) {
        AccessPrivateInnerClassPublicMethod.Formatter formatter = AccessPrivateInnerClassPublicMethod.Location("44.54", "94.54");
        List<String> location = formatter.locationFinder();
        System.out.println(location);
    }
}
