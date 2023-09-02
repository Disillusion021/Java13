package com.coding.设计模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
    静态代理方式
 */
public class LoggingHandler2 implements InvocationHandler {

    public final InvocationHandler handler;

    public LoggingHandler2(InvocationHandler handler) {
        this.handler = handler;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("嵌套Handler2前处理");
        Object rs = handler.invoke(proxy, method, args);
        System.out.println("嵌套Handler2后处理");
        return rs;
    }
}
