package com.coding.设计模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
    之所以叫动态代理,是因为代理类不是在编译时显示定义,而是在运行时根据你传进来的被代理的对象是谁,动态创建的.体现了反射的动态性
    使用动态代理可以不用事先写好代理类, 在运行时动态生成代理类
    动态代理实际上是JVM在运行期动态创建class字节码并加载的过程
    动态代理的步骤:
        1. 创建被代理的类,并声明代理接口
        2. 创建一个实现InvocationHandler接口的类,并实现invoke方法(也可以用匿名内部类和lambda表达式创建);invoke方法中可以(1.调用被代理类的方法 2.增强功能)
        3. 调用Proxy的静态方法newProxyInstance创建一个代理类
        4. 通过代理调用方法
    // 创建出来的代理对象继承了Proxy类并实现了代理接口,调用代理方法时会调用InvocationHandler的invoke方法
 */

/*
    底层的动态代理实现类大概长这样：
    但是有区别,实际上是继承了Proxy类,Proxy类中有一个protected的InvocationHandler属性,并且有一个构造方法,传入InvocationHandler
    通过super.h.invoke调用InvocationHandler的invoke方法
    public class HelloDynamicProxy implements Hello {
        InvocationHandler handler;
        public HelloDynamicProxy(InvocationHandler handler) {
            this.handler = handler;
        }
        public void morning(String name) {
            handler.invoke(
               this,
               Hello.class.getMethod("morning", String.class),
               new Object[] { name });
        }
    }
 */
public class ProxyUtil {

    public static Object creatProxy(Object obj) { // obj为被代理对象
/*
     newProxyInstance(ClassLoader loader,
                    Class<?>[] interfaces,
                    InvocationHandler h)
                    参数1: 类加载器, 用于加载代理类, 可以通过被代理类获取其类加载器
                    参数2: 指定生成的代理长什么样子,也就是有哪些方法
                    参数3: 用来指定代理对象具体要干什么事情;代理对象的方法被调用时,会调用该接口的invoke方法,该方法返回的值就是代理对象的方法的返回值
*/
        // proxy表示代理对象, method表示当前调用的方法, args表示当前调用方法的参数
        // 创建出来的代理对象继承了Proxy类并实现了代理目标接口,调用代理方法时会调用InvocationHandler的invoke方法
        Object proxyInstance = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                long startTime = System.currentTimeMillis();

                if ("sing".equals(method.getName())) {
                    System.out.println("准备话筒,收钱20万");
                }
                if ("dance".equals(method.getName())) {
                    System.out.println("准备舞台,收钱100万");
                }
                Object rs = method.invoke(obj, args);

                long endTime = System.currentTimeMillis();
                System.out.println("方法共耗时" + (endTime - startTime) + "毫秒"); // 可以用代理的方式抽离方法前后的共通逻辑

                return rs; // invoke方法返回值就是代理对象的方法的返回值
            }
        });
        return proxyInstance;
    }

    /*
        InvocationHandler是真正的代理实现代码
        通过InvocationHandler的构造方法传入被代理对象,在invoke方法中反射调用被代理对象的方法
        通过InvocationHandler接口可以实现对真实角色的代理访问,并且可以在代理角色中附加上需要的功能
        嵌套代理也可以通过创建多个Handler来实现
     */
    public static void main(String[] args) {
        Star star = new Star();
        IStar starProxy = (IStar) ProxyUtil.creatProxy(star);
        String rs = starProxy.sing("Letter");
        System.out.println(rs);
        System.out.println("=====================================");
        starProxy.dance("Dance");
        System.out.println("==========================================================================");
        LoggingHandler loggingHandler = new LoggingHandler(star);
        IStar sProxy = (IStar) Proxy.newProxyInstance(IStar.class.getClassLoader(), new Class[]{IStar.class}, loggingHandler);
        String res = sProxy.sing("Lv");
        System.out.println(res);
        System.out.println("=====================================");
        sProxy.dance("Dance");
        System.out.println("==========================================================================");
        LoggingHandler loggingHandler1 = new LoggingHandler(star);
        LoggingHandler2 loggingHandler2 = new LoggingHandler2(loggingHandler1);
        IStar sProxy2 = (IStar) Proxy.newProxyInstance(IStar.class.getClassLoader(), new Class[]{IStar.class}, loggingHandler2);
        String rr = sProxy2.sing("Luv");
        System.out.println(rr);
        System.out.println("=====================================");
        sProxy2.dance("Dance");
        System.out.println("==========================================================================");
        LoggingHandler3 loggingHandler3 = new LoggingHandler3(sProxy2);
        IStar sProxy3 = (IStar) Proxy.newProxyInstance(IStar.class.getClassLoader(), new Class[]{IStar.class}, loggingHandler3);
        String ss = sProxy3.sing("uv");
        System.out.println(ss);
        System.out.println("=====================================");
        sProxy3.dance("Dance");
        System.out.println("==========================================================================");
    }

}
