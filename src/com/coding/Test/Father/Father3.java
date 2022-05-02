package com.coding.Test.Father;

public class Father3 {

    private String book = "爸爸的书";

    // 父类getBook()方法为本包可访问，子类getBook()方法也为本包可访问，父类与子类包不同所以没有冲突。
    // stoleBook()会先查找父类private级别的方法，若没有再查找package级别的方法，此时package级别下只有父类一个。所以只能调用父类的getBook()方法。
    // 若父类getBook()改为protected级别，那么protected级别下既有父类的getBook()方法，也有子类的getBook()方法，会根据动态绑定机制调用子类的getBook()。
    String getBook() {
        System.out.println("调用了父类的get方法");
        test();
        return book;
    }

    // 同理test()方法也是先根据访问修饰符级别，再根据动态绑定机制由子类到父类查找调用。因为同为public级别，所以动态绑定了子类的test()方法。
    public void test() {
        System.out.println("father");
    }

    public String stoleBook() {
        // 动态绑定机制：根据运行类型由子类到父类查找方法，但是首先依据访问修饰符从private到package到protected到public分范围查找。
        return getBook();
    }

}
