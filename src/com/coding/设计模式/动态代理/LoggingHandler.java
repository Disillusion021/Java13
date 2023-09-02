package com.coding.设计模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingHandler implements InvocationHandler {

    private final Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用之前记录日志");
        Object rs = method.invoke(target, args); //调用原方法
        System.out.println("调用之后记录日志");
        return rs;
    }

}
