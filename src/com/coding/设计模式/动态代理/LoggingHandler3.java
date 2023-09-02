package com.coding.设计模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
    嵌套动态代理
 */
public class LoggingHandler3 implements InvocationHandler {

    public final Object target;

    public LoggingHandler3(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("嵌套Handler3前处理");
        Object rs = method.invoke(target, args);
        System.out.println("嵌套Handler3后处理");
        return rs;
    }
}
