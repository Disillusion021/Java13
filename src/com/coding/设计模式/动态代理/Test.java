package com.coding.设计模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {

    // 动态代理和匿名内部类都可以在运行时动态创建某个接口的实现类
    // 区别是: 匿名类是简单实现接口, 动态代理可以代理增强原有的方法
    public static void main(String[] args) {
        IStar iStar = new IStar() {
            @Override
            public String sing(String songName) {
                System.out.println("明星唱歌" + songName);
                return "谢谢大家";
            }

            @Override
            public void dance(String danceName) {
                System.out.println("明星跳舞" + danceName);
            }
        };
        String rs = iStar.sing("k");
        System.out.println(rs);
        System.out.println("=====================================");
        iStar.dance("d");

        IStar iStar2 = (IStar) Proxy.newProxyInstance(IStar.class.getClassLoader(), new Class[]{IStar.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("sing".equals(method.getName())) {
                    System.out.println("明星唱歌" + args[0]);
                    return "谢谢大家";
                }
                if ("dance".equals(method.getName())) {
                    System.out.println("明星跳舞" + args[0]);
                }
                return null;
            }
        });
        System.out.println("=====================================");
        String rs2 = iStar2.sing("k");
        System.out.println(rs2);
        System.out.println("=====================================");
        iStar2.dance("d");
    }
}
