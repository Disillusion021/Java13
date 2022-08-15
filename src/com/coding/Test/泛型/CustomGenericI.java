package com.coding.Test.泛型;

// 在继承接口时指定泛型接口的类型
interface IA extends CustomGenericI<String, Double> {

}

// 当我们去实现IA接口时，因为IA在继承CustomGenericI接口时，指定了U为String，R为Double。
// 所以在实现CustomGenericI接口的方法时，会使用String替换U，使用String替换R。
class AA implements IA {

    @Override
    public Double get(String u) {
        return null;
    }

    @Override
    public void hi(Double r) {
        
    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {
        
    }

}

// 实现接口时，直接指定泛型接口的类型
// 给U指定了Integer，给R指定了Double
class BB implements CustomGenericI<Integer, Double> {

    @Override
    public Double get(Integer u) {
        return null;
    }

    @Override
    public void hi(Double r) {
        
    }

    @Override
    public void run(Double r1, Double r2, Integer u1, Integer u2) {
        
    }

}
// 自定义泛型接口
// 泛型接口的泛型类型在继承接口或者实现接口时确定
public interface CustomGenericI<U, R> {

    // 注意细节
    // 1. 静态成员不能使用泛型
    // 2. 泛型接口的类型，在继承接口或者实现接口时确定
    // 3. 在继承和实现接口时没有指定泛型类型的话，默认类型为Object

    // 普通方法中，可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    // 默认方法也可以使用泛型
    default R method(U u) {
        return null;
    }
}

