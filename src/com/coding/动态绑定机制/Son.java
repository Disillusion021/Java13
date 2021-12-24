package com.coding.动态绑定机制;

public class Son extends Dad{
    public String name = "儿子";

//    public String getName() {
//        return super.name;
//    }

    @Override
    public void setName(String name) {
        System.out.println("子类的方法");
        this.name = name + this;
        super.name = "天王老子";
    }

    public static void main(String[] args) {
        Dad s = new Son();
        Son son = new Son();
        System.out.println(s.name); //老子
        //* 表示注释掉getName方法
        //* 运行类型是Son,但是子类中没有getName()方法，所以会找子类对象中继承下来的父类方法getName()，父类方法中的getName()中还有setName()方法，
        //* 此时根据动态绑定机制，还是从子类Son中开始寻找setName()方法,子类中有setName()方法，所以执行子类的setName()方法
        //* 输出 "子类的方法" 子类的name属性改为 "设置Name属性 + 子类对象的地址" (自始至终都只有一个子类对象，不存在父类对象，因为创建子类对象只会调用父类的构造方法而并不会创建父类对象)，super.用来调用子类对象中继承父类的name属性会被改成 "天王老子"
        //* setName()执行完后，子类对象中继承父类的name属性会从 "天王老子" 改成 "祖宗 + 子类对象的地址"
        //* 最后getName()方法返回子类对象中继承父类的name属性，也就是 "祖宗 + 子类对象的地址"
        System.out.println(s.getName()); //老子 动态绑定，会运行Son类里的方法，super.调用的是子类对象继承父类的成员
        Son ss = (Son)s; //下转型 ss的编译类型运行类型都为 Son
        //* 下转型后输出子类的name属性，即 "设置Name属性 + 子类对象的地址"
        System.out.println(ss.name); //儿子
        System.out.println(son.name); //儿子
        System.out.println(son.getName()); //老子
        System.out.println(son.name); // 儿子

    }
}
