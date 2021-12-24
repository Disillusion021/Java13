package com.coding.Test;

public class Teacher extends Person {
    private  String name = "tom";
    //这是Teacher的无参构造器，在new Teacher时自动调用。
//    this.name = "tommy";
    public Teacher() {
        super();//父类无参构造器，可以不写，默认存在，但是若写，必须写在第一行。
        System.out.println("this is a teacher");
        System.out.println(this.name);//this关键字只能写在非静态方法中
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
//        Test17.PERSON.age = 20;
        System.out.println(Test17.PERSON.age);
    }
}
